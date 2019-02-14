package com.miniproject.carryon.CarryOn;

public class Place {
    private int id;
    private String country;
    private String city;
    private String address;
    private String name;
    private Boolean isCompany;
    private double price;
    private int timeOpen;
    private int timeClose;
    private int rating;
    private String description;

    public Place(int id, String country, String city, String address, String name, Boolean isCompany, double price, int timeOpen, int timeClose, int rating, String description) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.address = address;
        this.name = name;
        this.isCompany = isCompany;
        this.price = price;
        this.timeOpen = timeOpen;
        this.timeClose = timeClose;
        this.rating = rating;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public Boolean getCompany() {
        return isCompany;
    }

    public double getPrice() {
        return price;
    }

    public int getTimeOpen() {
        return timeOpen;
    }

    public int getTimeClose() {
        return timeClose;
    }

    public String getRating() {
        switch(rating) {
            case 1:
                return "★✫✫✫✫";
            case 2:
                return "★★✫✫✫";
            case 3:
                return "★★★✫✫";
            case 4:
                return "★★★★✫";
            case 5:
                return "★★★★★";
            default:
                return "N/A";
        }
    }

    public String getDescription() {
        return description;
    }

}