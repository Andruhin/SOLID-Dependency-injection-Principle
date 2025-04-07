package org.kotlin.test2.mappers;

import org.kotlin.test2.ViewData;
import org.kotlin.test2.data.Tool;

public class ToolMapper implements ItemMapper {
    private Tool tool;
    public ToolMapper(Tool tool) {
        this.tool = tool;
    }

    @Override
    public ViewData toViewData() {
        return new ViewData(tool.name, tool.price, tool.icon, tool.power);
    }
}
