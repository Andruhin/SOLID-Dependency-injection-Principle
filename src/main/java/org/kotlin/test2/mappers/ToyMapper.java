package org.kotlin.test2.mappers;

import org.kotlin.test2.ViewData;
import org.kotlin.test2.data.Toy;

public class ToyMapper implements ItemMapper {
    private Toy toy;
    public ToyMapper(Toy toy) {
        this.toy = toy;
    }

    @Override
    public ViewData toViewData() {
        return new ViewData(toy.name, toy.price, toy.icon, String.valueOf(toy.age));
    }
}
