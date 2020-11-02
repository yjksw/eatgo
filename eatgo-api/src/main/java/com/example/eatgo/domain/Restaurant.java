package com.example.eatgo.domain;

public class Restaurant {


    private final String name;
    private final String addr;
    private final Long id;

    public Restaurant(Long id, String name, String addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }

    public Long getId() {
        return id;
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
