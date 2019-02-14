package com.miniproject.carryon.CarryOn;

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

    @Autowired
    private PlaceRepo repository;

    @GetMapping("/")
    public String home() {
        return "carryon_home";
    }

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

    public String searchEngine(Model model) {
        if (!lowerCaseInput.equals("")) {
            List<Place> places = repository.allPlaces();
            List<Place> resultList = new ArrayList<>();
            for (Place place : places) {
                if (place.getCity().toLowerCase().equals(lowerCaseInput)) {
                    resultList.add(place);
                }
            }
            model.addAttribute("result_list", resultList);
            return "carryon_results";
        } else {
            return "carryon_home";
        }
    }
}