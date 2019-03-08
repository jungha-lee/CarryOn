package com.miniproject.carryon;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepo extends CrudRepository<Booking,Integer> {
//    @Query(value = "SELECT * FROM Booking INNER JOIN CUSTOMER ON Customer.Id = Booking.Customer_Id INNER JOIN PLACE ON PLACE.ID=BOOKING.PLACE_ID WHERE Customer.UserName = ?", nativeQuery = true)
//    Iterable<Booking> findBookingsByUserName(String userName);

//    @Modifying
//    @Query(value = "INSERT INTO Booking (CUSTOMER_ID,PLACE_ID) VALUES ((SELECT Id FROM Customer WHERE USERNAME ='emma'), (SELECT Id FROM Place  WHERE Id=1))", nativeQuery = true)
//    Booking addBooking();


}
