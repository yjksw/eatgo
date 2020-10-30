package com.example.eatgo.domain;

public class Restaurant {


    private final String name;
    private final String addr;

    public Restaurant(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;
    }

    public String getInformation() {
        return name + " in " + addr;
    }
}
