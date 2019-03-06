package com.miniproject.carryon;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarryOnApplicationTests {

	@Autowired
	PlaceRepo placeRepo;
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    BookingRepo bookingRepo;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testDataForPlaces() {
		List<Place> places = (List<Place>)placeRepo.findAll();
		Assert.assertEquals("number of places", 3, places.size());
	}

    @Test
    public void testDataForCustomers() {
        List<Customer> customers = (List<Customer>)customerRepo.findAll();
        Assert.assertEquals("number of customers", 4, customers.size());
    }

    @Test
    public void testDataForBookings() {
        List<Booking> bookings = (List<Booking>)bookingRepo.findAll();
        Assert.assertEquals("number of bookings", 2, bookings.size());
    }


}

