package org.kotlin.test2;

import java.util.List;

public interface View {
    void render(ViewData viewData);
    void renderViews(List<ViewData> viewDataList);
}
