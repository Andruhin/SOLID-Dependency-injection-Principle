package org.kotlin.test2.data;

public class Toy extends Item {
    public int age;

    public Toy(String name, String icon, double price, int age) {
        super(name, icon, price);
        this.age = age;
    }
}
