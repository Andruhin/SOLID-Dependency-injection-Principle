package org.kotlin.test2.data;

public class Tool extends Item {
    public String power;

    public Tool(String name, String icon, double price, String power) {
        super(name, icon, price);
        this.power = power;
    }
}
