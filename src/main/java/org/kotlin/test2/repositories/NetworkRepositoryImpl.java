package org.kotlin.test2.repositories;

import org.kotlin.test2.data.Food;
import org.kotlin.test2.data.Item;
import org.kotlin.test2.data.Tool;
import org.kotlin.test2.data.Toy;

import java.util.ArrayList;
import java.util.List;

public class NetworkRepositoryImpl {

    public List<Item> getItems() {
        System.out.println("Retrieve Items from Network");
        Toy toy = new Toy("Toy1", "ToyIcon1", 10.0, 12);
        Tool tool = new Tool("Tool1", "ToolIcon1", 20.0, "1200 W");
        Food food = new Food("Food", "FoodIcon", 30.0, "500 cal");
        ArrayList<Item> list = new ArrayList<>();
        list.add(toy);
        list.add(toy);
        list.add(tool);
        list.add(tool);
        list.add(food);
        list.add(food);
        return list;
    }
}
