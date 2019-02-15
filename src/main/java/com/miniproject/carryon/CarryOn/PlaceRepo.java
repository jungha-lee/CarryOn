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
        places.add(new Place(1, "Sweden", "Stockholm", "Hamngatan 29, 111 47 STOCKHOLM", "Swedbank AB", true, 110, 8, 17, 5, "We are a centrally placed bank who in addition to storing money also can offer a bag storing service!"));
        places.add(new Place(2, "Sweden", "Stockholm", "Hornsgatan 3, 120 31 STOCKHOLM", "Espresso House", true, 60, 10, 20, 3, "Welcome to Espresso House! We make best coffee in town. Drop by and leave your bag."));
        places.add(new Place(3, "Sweden", "Stockholm", "Hammarby Kaj 10A, 112 41 STOCKHOLM", "Flipping Burger", true, 90, 8, 17, 4, "We are a centrally placed bank who in addition to storing money also can offer a bag storing service!"));
        places.add(new Place(4, "Sweden", "Stockholm", "Sveavägen 60, 108 11 STOCKHOLM", "Gallerian", true, 90, 8, 17, 1, "We are a centrally placed bank who in addition to storing money also can offer a bag storing service!"));
        places.add(new Place(5, "Sweden", "Stockholm", "Drottninggatan 121, 130 20 STOCKHOLM", "Kulturhuset", true, 90, 8, 17, 3, "We are a centrally placed bank who in addition to storing money also can offer a bag storing service!"));
        places.add(new Place(6, "Sweden", "Luleå", "Nygatan 3, 971 71 LULEÅ", "Johan Johansson", false, 120, 9, 18, 4, "Hej there! My name is Johan and I am a student in Luleå. I take online courses and do hence have a lot of spare time! "));
        places.add(new Place(7, "Sweden", "Umeå", "Kardangatan 4, 904 22, UMEÅ", "Academy AB", true, 130, 10, 19, 3, "We educate programmers in Java and C##, our Umeå studio has a lot of space which means we can offer a bag keeping business..."));
        places.add(new Place(8, "Sweden", "Gothenburg", "Redbergsgatan 6, 416 65, GOTHENBURG", "Anna Stewart", false, 140, 8, 17, 5, "Hello there! My name is Anna, I am an entrepreuner working in central Gothenburg..."));
        places.add(new Place(9, "Sweden", "Piteå", "Hotellgatan 5, 941 43 PITEÅ", "Pite Havsbad", true, 150, 9, 18, 4, "During winter season we don´t have a lot of customers due to freezing degrees, which means lot of space for your bags!"));
        places.add(new Place(10, "United Arab Emirates", "Dubai", "E11, 678 635, DUBAI", "Buzz Dubai", true, 110, 8, 17, 5, "The airport can store your bags against a little fee.."));
        places.add(new Place(11, "United Arab Emirates", "Dubai", "Sheikh Zayed Road 456, 897 3734. DUBAI", "Mirabelle Montmartre", false, 120, 9, 18, 2, "Hello! My name is Mirabelle, I work as a programmer from home and have a lot of space for bags..."));
        places.add(new Place(12, "United Arab Emirates", "Dubai", "E44, 6738 3834, DUBAI", "Emirates Group", true, 130, 10, 19, 3, "Our airline is extending our services, we now offer bag keeping services!"));
        places.add(new Place(13, "United Arab Emirates", "Dubai", "Emirates Road, 6384 486, DUBAI", "Camil Khoury", false, 140, 8, 17, 5, "Hi! My name is Camil a stay home dad in a big apartment in central Dubai, we have lots of space.."));
        places.add(new Place(14, "United Arab Emirates", "Dubai", "E 66, 576 4677, DUBAI", "DP World", true, 150, 9, 18, 4, "We have a lot of storage and can now happily announce that we will offer bag keeping services!"));
        places.add(new Place(15, "France", "Paris", "Champs-Elysées 489, 237 484, PARIS", "Edith Piaf", false, 160, 10, 19, 2, "Bonjour! I offer bag keeping services!"));
        places.add(new Place(16, "France", "Lyon", "Rue Victor Hugo 34, 4674 774, LYON", "Fromage et chaussers", true, 170, 9, 18, 3, "Salut le monde! on offre des services bag storage. Trop bon! Comme le fromage"));
        places.add(new Place(17, "France", "Montpellier", "Champ de Mars 11, 3738 4384, MONTPELLIER", "Jean Baptiste Bernadotte", false, 180, 8, 17, 5, "Hey there, Jean here! I am a open person who loves taking care of bags..."));
    }


    public List<Place> allPlaces() {
        return places;
    }

}