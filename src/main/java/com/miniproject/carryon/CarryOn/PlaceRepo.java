package com.miniproject.carryon.CarryOn;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaceRepo {
    private List<Place> places;

    public PlaceRepo() {
        places = new ArrayList<>();

        // Register places
        places.add(new Place(1, "Sweden", "Stockholm", "Place address street 01", "Stockholm place 01", true, 110, 8, 17, 5, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        places.add(new Place(2, "Sweden", "Stockholm", "Place address street 02", "Stockholm place 02", false, 120, 9, 18, 4, "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."));
        places.add(new Place(3, "Sweden", "Stockholm", "Place address street 03", "Stockholm place 03", true, 130, 10, 19, 3, "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."));
        places.add(new Place(4, "Sweden", "Stockholm", "Place address street 04", "Stockholm place 04", false, 140, 8, 17, 5, "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));
        places.add(new Place(5, "Sweden", "Stockholm", "Place address street 05", "Stockholm place 05", true, 150, 9, 18, 4, "Condimentum lacinia quis vel eros donec ac odio tempor. Erat imperdiet sed euismod nisi porta lorem mollis aliquam ut."));
        places.add(new Place(6, "United Arab Emirates", "Dubai", "Place address street 06", "Dubai place 06", true, 110, 8, 17, 5, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        places.add(new Place(7, "United Arab Emirates", "Dubai", "Place address street 07", "Dubai place 07", false, 120, 9, 18, 4, "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."));
        places.add(new Place(8, "United Arab Emirates", "Dubai", "Place address street 08", "Dubai place 08", true, 130, 10, 19, 3, "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."));
        places.add(new Place(9, "United Arab Emirates", "Dubai", "Place address street 09", "Dubai place 09", false, 140, 8, 17, 5, "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));
        places.add(new Place(10, "United Arab Emirates", "Dubai", "Place address street 10", "Dubai place 10", true, 150, 9, 18, 4, "Condimentum lacinia quis vel eros donec ac odio tempor. Erat imperdiet sed euismod nisi porta lorem mollis aliquam ut."));
        places.add(new Place(11, "France", "Paris", "Place address street 11", "Paris place 11", false, 160, 10, 19, 4, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        places.add(new Place(12, "France", "Paris", "Place address street 12", "Paris place 12", true, 170, 9, 18, 4, "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."));
        places.add(new Place(13, "France", "Paris", "Place address street 13", "Paris place 13", false, 180, 8, 17, 4, "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."));
    }

    public List<Place> allPlaces() {
        return places;
    }

}