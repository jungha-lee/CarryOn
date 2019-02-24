package com.miniproject.carryon;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaceRepo {
    private List<Place> places;

    public PlaceRepo() {
        places = new ArrayList<>();

        // Register places
        places.add(new Place(1, "Sweden", "Stockholm", "Landsvägen 40, 172 63 SUNDBYBERG", "Swedbank AB", 59.359163, 17.974759, true, 110, 8, 17, 5, "We are a centrally placed bank who in addition to storing money also can offer a bag storing service!"));
        places.add(new Place(2, "Sweden", "Stockholm", "Drottninggatan 16, 111 51 STOCKHOLM", "Espresso House", 59.330144, 18.065417, true, 60, 10, 20, 3, "Welcome to Espresso House! We make best coffee in town. Drop by and leave your bag."));
        places.add(new Place(3, "Sweden", "Stockholm", "Observatoriegatan 8, 113 29 STOCKHOLM", "Flippin' Burgers", 59.340831, 18.050811, true, 90, 8, 17, 4, "We are a centrally placed bank who in addition to storing money also can offer a bag storing service!"));
        places.add(new Place(4, "Sweden", "Stockholm", "Hamngatan 37, 111 53 STOCKHOLM", "Gallerian", 59.332066, 18.067563, true, 90, 8, 17, 1, "We are a centrally placed bank who in addition to storing money also can offer a bag storing service!"));
        places.add(new Place(5, "Sweden", "Stockholm", "Djurgårdsslätten 49-51, 115 21 Stockholm", "Skansen", 59.327406, 18.106451, true, 90, 8, 17, 3, "We are a centrally placed bank who in addition to storing money also can offer a bag storing service!"));
        places.add(new Place(6, "United States", "San Francisco", "Elm Street 12, 678 635, SAN FRANCISCO", "Google Inc.", 59.3262416, 17.8416298, true, 110, 8, 17, 5, "We are a company situated in central San Fransisco..."));
        places.add(new Place(7, "United States", "San Francisco", "Fishermans wharf 45, 678 635, SAN FRANCISCO", "Ghirardelli", 59.3262416, 17.8416298, true, 130, 8, 17, 3, "We make chocolate and store bags.."));
        places.add(new Place(8, "United States", "San Francisco", "Viola Street 23, 46386 373, SAN FRANCISCO","Alcatraz museum", 59.3262416, 17.8416298, true, 10, 8, 17, 4, "The prison island know anounces a bag storing service!"));
        places.add(new Place(9, "United States", "San Francisco", "Neon valley 47, 3788 384, 678 635, SAN FRANCISCO", "Facebook", 59.3262416, 17.8416298, true, 180, 8, 17, 5, "Store your bag in the Facebook headquarters!"));
        places.add(new Place(10, "United States", "San Francisco", "Old town 23, 678 635, SAN FRANCISCO", "Uber", 59.3262416, 17.8416298, true, 90, 8, 17, 5, "Take an uber to our office and store your bag here!"));
        places.add(new Place(11, "United States", "San Francisco", "Farmers street 393, 678 635, SAN FRANCISCO", "Wine ´n´dine", 59.3262416, 17.8416298, true, 75, 8, 17, 2, "We are a restaurant in central San Fransisco..."));
        places.add(new Place(12, "United Arab Emirates", "Dubai", "E11, 678 635, DUBAI", "Buzz Dubai", 59.3262416, 17.8416298, true, 110, 8, 17, 5, "The airport can store your bags against a little fee.."));
        places.add(new Place(13, "United Arab Emirates", "Dubai", "Sheikh Zayed Road 456, 897 3734. DUBAI", "Mirabelle Montmartre", 59.3262416, 17.8416298, false, 120, 9, 18, 2, "Hello! My name is Mirabelle, I work as a programmer from home and have a lot of space for bags..."));
        places.add(new Place(14, "United Arab Emirates", "Dubai", "E44, 6738 3834, DUBAI", "Emirates Group", 59.3262416, 17.8416298, true, 130, 10, 19, 3, "Our airline is extending our services, we now offer bag keeping services!"));
        places.add(new Place(15, "United Arab Emirates", "Dubai", "Emirates Road, 6384 486, DUBAI", "Camil Khoury", 59.3262416, 17.8416298, false, 140, 8, 17, 5, "Hi! My name is Camil a stay home dad in a big apartment in central Dubai, we have lots of space.."));
        places.add(new Place(16, "United Arab Emirates", "Dubai", "E 66, 576 4677, DUBAI", "DP World", 59.3262416, 17.8416298, true, 150, 9, 18, 4, "We have a lot of storage and can now happily announce that we will offer bag keeping services!"));
        places.add(new Place(17, "Sweden", "Luleå", "Nygatan 3, 971 71 LULEÅ", "Johan Johansson", 59.3262416, 17.8416298, false, 120, 9, 18, 4, "Hej there! My name is Johan and I am a student in Luleå. I take online courses and do hence have a lot of spare time! "));
        places.add(new Place(18, "Sweden", "Umeå", "Kardangatan 4, 904 22, UMEÅ", "Academy AB", 59.3262416, 17.8416298, true, 130, 10, 19, 3, "We educate programmers in Java and C##, our Umeå studio has a lot of space which means we can offer a bag keeping business..."));
        places.add(new Place(19, "Sweden", "Gothenburg", "Redbergsgatan 6, 416 65, GOTHENBURG", "Anna Stewart", 59.3262416, 17.8416298, false, 140, 8, 17, 5, "Hello there! My name is Anna, I am an entrepreuner working in central Gothenburg..."));
        places.add(new Place(20, "Sweden", "Piteå", "Hotellgatan 5, 941 43 PITEÅ", "Pite Havsbad", 59.3262416, 17.8416298, true, 150, 9, 18, 4, "During winter season we don´t have a lot of customers due to freezing degrees, which means lot of space for your bags!"));
        places.add(new Place(21, "France", "Paris", "Champs-Elysées 489, 237 484, PARIS", "Edith Piaf", 59.3262416, 17.8416298, false, 160, 10, 19, 2, "Bonjour! I offer bag keeping services!"));
        places.add(new Place(22, "France", "Paris", "Rue Victor Hugo 34, 4674 774, LYON", "Fromage et chaussers", 59.3262416, 17.8416298, true, 170, 9, 18, 3, "Salut le monde! on offre des services bag storage. Trop bon! Comme le fromage"));
        places.add(new Place(23, "France", "Paris", "Champ de Mars 11, 3738 4384, MONTPELLIER", "Jean Baptiste Bernadotte", 59.3262416, 17.8416298, false, 180, 8, 17, 5, "Hey there, Jean here! I am a open person who loves taking care of bags..."));
    }


    public List<Place> allPlaces() {
        return places;
    }

}