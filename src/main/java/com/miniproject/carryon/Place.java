package com.miniproject.carryon;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String country;
    private String city;
    private String address;
    private String name;
    private double lat;
    private double lng;
    @Column(name = "BAG_CAPACITY")
    private int bagCapacity;
    private double price;
    @Column(name = "TIME_OPEN")
    @Size(min=0,max=24)
    private int timeOpen;
    @Column(name = "TIME_CLOSE")
    @Size(min=0,max=24)
    private int timeClose;
    private int rating;
    private String description;

    public Place() {

    }

    public Place(Integer id, String country, String city, String address, String name, double lat, double lng, int bagCapacity, double price, int timeOpen, int timeClose, int rating, String description) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.address = address;
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.bagCapacity = bagCapacity;
        this.price = price;
        this.timeOpen = timeOpen;
        this.timeClose = timeClose;
        this.rating = rating;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public int getBagCapacity() {
        return bagCapacity;
    }

    public void setBagCapacity(int bagCapacity) {
        this.bagCapacity = bagCapacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTimeOpen() {
        return timeOpen;
    }

    public void setTimeOpen(int timeOpen) {
        this.timeOpen = timeOpen;
    }

    public int getTimeClose() {
        return timeClose;
    }

    public void setTimeClose(int timeClose) {
        this.timeClose = timeClose;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


//@Entity
//public class Place {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private String country;
//
//    public Place() {
//
//    }
//
//    public Place(Integer id, String country) {
//        this.id = id;
//        this.country = country;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//}



//package com.miniproject.carryon;
//
//public class Place {
//    private int id;
//    private String country;
//    private String city;
//    private String address;
//    private String name;
//    private Boolean isCompany;
//    private double price;
//    private int timeOpen;
//    private int timeClose;
//    private int rating;
//    private double lat;
//    private double lng;
//    private String description;
//
//    public Place(int id, String country, String city, String address, String name, double lat, double lng, Boolean isCompany, double price, int timeOpen, int timeClose, int rating, String description) {
//        this.id = id;
//        this.country = country;
//        this.city = city;
//        this.address = address;
//        this.name = name;
//        this.lat = lat;
//        this.lng = lng;
//        this.isCompany = isCompany;
//        this.price = price;
//        this.timeOpen = timeOpen;
//        this.timeClose = timeClose;
//        this.rating = rating;
//        this.description = description;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getLat() {
//        return lat;
//    }
//
//    public double getLng() {
//        return lng;
//    }
//
//    public Boolean getCompany() {
//        return isCompany;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public int getTimeOpen() {
//        return timeOpen;
//    }
//
//    public int getTimeClose() {
//        return timeClose;
//    }
//
//    public String getRating() {
//        switch(rating) {
//            case 1:
//                return "★✫✫✫✫";
//            case 2:
//                return "★★✫✫✫";
//            case 3:
//                return "★★★✫✫";
//            case 4:
//                return "★★★★✫";
//            case 5:
//                return "★★★★★";
//            default:
//                return "N/A";
//        }
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//}