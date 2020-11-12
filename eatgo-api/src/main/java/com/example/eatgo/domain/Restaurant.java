package com.example.eatgo.domain;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {


    private final String name;
    private final String addr;
    private final Long id;
    private final List<MenuItem> menuItems = new ArrayList<>();

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

    public List<MenuItem> getMenuItems () {
        return menuItems;
    }
    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
        return;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        for(MenuItem menuItem: menuItems) {
            addMenuItem(menuItem);
        }
    }
}
