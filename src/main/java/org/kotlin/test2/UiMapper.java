package org.kotlin.test2;

import org.kotlin.test2.data.Item;
import org.kotlin.test2.data.Tool;
import org.kotlin.test2.data.Toy;
import org.kotlin.test2.mappers.ItemMapper;

import java.util.ArrayList;
import java.util.List;

public class UiMapper {

    List<ViewData> toView(List<ItemMapper> items) {
        List<ViewData> data = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            data.add(items.get(i).toViewData());
        }
        return data;
    }

}

