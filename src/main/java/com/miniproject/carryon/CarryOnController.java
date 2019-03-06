package com.miniproject.carryon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarryOnController {
    public static String lowerCaseInput;
    // booking list below is for myBooking method.
    List<Place> bookingList = new ArrayList<>();

    @Autowired
    private PlaceRepo repository;

    // when you connect to localhost:8080 - it shows carryon_home.html
    @GetMapping("/")
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
    public String detailPage(Model model, @PathVariable Integer id) {
        List<Place> places = repository.allPlaces();

        for (Place place : places) {
            if (place.getId() == id) {
                Place showPlace = place;
                model.addAttribute("show_place", showPlace);
            }
        }
        return "carryon_details";
    }

    @GetMapping("/book/{id}")
    public String myBooking(Model model, @PathVariable Integer id) {
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

        model.addAttribute("book_place", bookingList);
        return "carryon_mybookings";
    }

    //Search and return results and the number of them.
    public String searchEngine(Model model) {
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
        } else {
            return "carryon_home";
        }
    }
}