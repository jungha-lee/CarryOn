package com.miniproject.carryon;

import org.springframework.data.repository.CrudRepository;

public interface PlaceRepo extends CrudRepository<Place,Integer> {
    // SELECT * FROM PLACE WHERE CITY = String(city)
    Iterable<Place> findByCity(String city);

    // SELECT * FROM PLACE WHERE ID = Integer(id)
    Place findPlaceById(Integer id);


}

// SELECT * FROM PLACE WHERE ID = Integer(id)
//    @Query("SELECT p FROM Place p WHERE p.id = ?1")
//    Place findPlaceById(Integer id);