package com.example.eatgo.interfaces;

import com.example.eatgo.domain.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> list() {
        List<Restaurant> restaurants = new ArrayList<>();

        Restaurant restaurant = new Restaurant(1004L, "Bap zip", "Seoul");

        restaurants.add(restaurant);
        return restaurants;
    }
}