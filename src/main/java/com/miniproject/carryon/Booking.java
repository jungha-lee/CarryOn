package com.miniproject.carryon;

import javax.persistence.*;
import java.util.Date;


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
    private Date dateStart;
    @Column(name = "DATE_END")
    private Date dateEnd;

    public Booking(Integer id, Integer customerId, Integer placeId, int bagAmount, Date dateStart, Date dateEnd) {
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

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }
}
