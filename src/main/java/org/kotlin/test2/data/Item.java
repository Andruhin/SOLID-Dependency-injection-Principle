package org.kotlin.test2.data;

public abstract class Item {
    public String name = null;
    public String icon = null;
    public double price = 0.0;

    public Item(String name, String icon, double price) {
        this.name = name;
        this.icon = icon;
        this.price = price;
    }
}

