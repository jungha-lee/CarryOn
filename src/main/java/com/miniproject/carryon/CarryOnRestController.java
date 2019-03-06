package com.miniproject.carryon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class CarryOnRestController {
    @Autowired
    private PlaceRepo repository;

    @GetMapping("/scriptRequest")
    @ResponseBody
    public List<Place> scriptRequest() {
        return null;
    }
}