package org.kotlin.test2.data;

public class Food extends Item {
    public String callories;

    public Food(String name, String icon, double price, String callories) {
        super(name, icon, price);
        this.callories = callories;
    }
}
