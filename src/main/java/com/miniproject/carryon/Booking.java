package com.miniproject.carryon;

import javax.persistence.*;


@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "CUSTOMER_ID")
    private int customerId;
    @Column(name = "PLACE_ID")
    private int placeId;
    @Column(name = "BAG_AMOUNT")
    private int bagAmount;
    @Column(name = "DATE_START")
    private String dateStart;
    @Column(name = "DATE_END")
    private String dateEnd;

    public Booking() {

    }

    public Booking(Integer id, int customerId, int placeId, int bagAmount, String dateStart, String dateEnd) {
        this.id = id;
        this.customerId = customerId;
        this.placeId = placeId;
        this.bagAmount = bagAmount;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    public int getBagAmount() {
        return bagAmount;
    }

    public void setBagAmount(int bagAmount) {
        this.bagAmount = bagAmount;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }
}
