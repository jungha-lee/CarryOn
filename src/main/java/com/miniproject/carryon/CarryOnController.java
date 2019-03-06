package com.miniproject.carryon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarryOnController {
    public static String lowerCaseInput;
    // booking list below is for myBooking method.
    List<Place> bookingList = new ArrayList<>();

    @Autowired
    private PlaceRepo repository;


    //Login get and post mapping


    @GetMapping("/")
    public String loginForm(){
        return "carryon_login";
    }

    @PostMapping("/")
    public String LoginForm(HttpSession session, @RequestParam String username, @RequestParam String password){
        if (username.equals("admin") && password.equals("123")) {
            session.setAttribute("username", username);
            return "carryon_home";
        }
        return "carryon_login";
    }

    //Registraion form
    @GetMapping("/register")
    public String register(){
        return "carryon_register";
    }
    @PostMapping("/register")
    public String registrationFrom(){

        return "carryon_login";
    }
    

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("username"); // this would be an ok solution
        session.invalidate(); // you could also invalidate the whole session, a new session will be created the next request
        return "carryon_login";
    }

    @GetMapping("/home")
    public String home() {
        return "carryon_home";
    }

    // when a form(action=search) in html is submitted, this executed.
    // searchInput is coming from inputfield name in html.
    @PostMapping("/search")
    public String search(Model model, @RequestParam String searchInput) {
        lowerCaseInput = searchInput.toLowerCase();
        return searchEngine(model);
    }


    @GetMapping("/search/detail/{id}")
    public String detailPage(HttpSession session,Model model, @PathVariable Integer id) {
        List<Place> places = repository.allPlaces();
        String username = (String) session.getAttribute("username");
        if (username != null) {
            for (Place place : places) {
                if (place.getId() == id) {
                    Place showPlace = place;
                    model.addAttribute("show_place", showPlace);
                }
            }
            return "carryon_details";
        } else{
            return "carryon_login";
        }

    }

    @GetMapping ("/book")
    public String myBookings(HttpSession session,Model model){
        String username = (String) session.getAttribute("username");
        if (username != null) {
            session.setAttribute("book_place", bookingList);
        }
        return "carryon_mybookings";
    }

    @PostMapping("/book")
    public String myBooking(Model model,HttpSession session, @RequestParam String id) {
        int bookingId = Integer.parseInt(id);
        return booking(session,bookingId);
    }

    //MOVE METHODS TO SEPARATE CLASS!!!
    //Search and return results and the number of them.
    public String searchEngine( Model model) {
        if (!lowerCaseInput.equals("")) {
            List<Place> places = repository.allPlaces();
            List<Place> resultList = new ArrayList<>();
            Integer nrResults = 0;


                for (Place place : places) {
                    if (place.getCity().toLowerCase().equals(lowerCaseInput)) {
                        resultList.add(place);
                        nrResults++;
                    }
                }
                model.addAttribute("nr_of_results", nrResults);
                model.addAttribute("result_list", resultList);
                return "carryon_results";
            }
        return "carryon_home";
    }


    //Method for chosing which booking to book.
    public String booking(HttpSession session, int id){



        List<Place> places = repository.allPlaces();
        boolean isDouble = false;
        if(bookingList != null){
            for(Place place : bookingList){
                if(place.getId() == id){
                    isDouble = true;
                }
            }
        }
        for (Place place : places) {
            if (place.getId() == id && !isDouble) {
                Place bookPlace = place;
                bookingList.add(bookPlace);
            }
        }

        session.setAttribute("book_place", bookingList);
        return "carryon_mybookings";
    }


}