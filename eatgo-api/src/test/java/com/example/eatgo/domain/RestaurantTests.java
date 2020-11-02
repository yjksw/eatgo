package com.example.eatgo.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


class RestaurantTests {

    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant(1004L, "Bap zip", "Seoul");
        assertThat(restaurant.getId(), is(1004L));
        assertThat(restaurant.getName(), is("Bap zip"));
        assertThat(restaurant.getAddr(), is("Seoul"));
    }

    @Test
    public void information() {
        Restaurant restaurant  = new Restaurant(1004L, "Bap zip", "Seoul");
        assertThat(restaurant.getInformation(), is("Bap zip in Seoul"));
    }
}