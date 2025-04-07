package org.kotlin.test2;

import java.util.List;

public class MyView implements View {
    /**
     * Base method
     */
    private void render(String title, double price, String icon, String additionalNotes) {
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
        System.out.println("icon: "+icon);
        System.out.println("Additional notes: "+additionalNotes);
    }

    //Third implementation

    @Override
    public void render(ViewData viewData) {
        render(viewData.title, viewData.price, viewData.icon, viewData.additionalNotes);
    }

    @Override
    public void renderViews(List<ViewData> viewDataList) {
        for(int i = 0; i < viewDataList.size(); i++) {
            ViewData item = viewDataList.get(i);
            render(item);
        }
    }


}
