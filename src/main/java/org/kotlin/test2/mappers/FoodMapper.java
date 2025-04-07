package org.kotlin.test2.mappers;

import org.kotlin.test2.ViewData;
import org.kotlin.test2.data.Food;

public class FoodMapper implements ItemMapper {
    private Food food;
    public FoodMapper(Food food) {
        this.food = food;
    }

    @Override
    public ViewData toViewData() {
        return new ViewData(food.name, food.price, food.icon, food.callories);
    }
}
