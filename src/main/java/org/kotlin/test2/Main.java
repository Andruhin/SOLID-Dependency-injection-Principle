package org.kotlin.test2;

import org.kotlin.test2.data.Food;
import org.kotlin.test2.data.Item;
import org.kotlin.test2.data.Tool;
import org.kotlin.test2.data.Toy;
import org.kotlin.test2.mappers.FoodMapper;
import org.kotlin.test2.mappers.ItemMapper;
import org.kotlin.test2.mappers.ToolMapper;
import org.kotlin.test2.mappers.ToyMapper;
import org.kotlin.test2.repositories.LocalDbRepositoryImpl;
import org.kotlin.test2.repositories.NetworkRepositoryImpl;
import org.kotlin.test2.repositories.ProductRepositoryImpl;
import org.kotlin.test2.repositories.ServiceLocator;
import org.kotlin.test2.useCases.GetItemsUseCase;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        //First implementation
        System.out.println("!!!!!   New feature    !!!!!");
        System.out.println("!!!!!   New feature 5    !!!!!");

        LocalDbRepositoryImpl localDbRepository = new LocalDbRepositoryImpl();
        NetworkRepositoryImpl networkRepository = new NetworkRepositoryImpl();
        ProductRepositoryImpl productRepository = new ProductRepositoryImpl(networkRepository, localDbRepository);
        GetItemsUseCase useCase = new GetItemsUseCase(productRepository);
        boolean isInternetAvailable = false;
        List<Item> items = useCase.getItems(isInternetAvailable);

        showItems(items);

        System.out.println("");
        System.out.println("");

        isInternetAvailable = true;
        items = useCase.getItems(isInternetAvailable);

        showItems(items);

        System.out.println("");
        System.out.println("");
        System.out.println("!!!!!   Second Implementation    !!!!!");
        System.out.println("!!!!!   Second Implementation    !!!!!");
        //Second implementation
        ServiceLocator serviceLocator = new ServiceLocator();
        GetItemsUseCase injectedGetItemsUseCase = serviceLocator.provideGetItemsUseCase();
        isInternetAvailable = false;
        items = injectedGetItemsUseCase.getItems(isInternetAvailable);
        showItems(items);

        System.out.println("");
        System.out.println("");

        isInternetAvailable = true;
        items = injectedGetItemsUseCase.getItems(isInternetAvailable);
        showItems(items);
    }

    private static void showItems(List<Item> items){
        MyView view = new MyView();
        for (Item item: items) {
            if (item instanceof Toy) {
                //render old elements
                ItemMapper toyMapper = new ToyMapper((Toy) item);
                view.render(toyMapper.toViewData());
            } else   if (item instanceof Tool) {
                //render old elements
                ItemMapper toolMapper = new ToolMapper((Tool) item);
                view.render(toolMapper.toViewData());
            } else   if (item instanceof Food) {
                //render old elements
                ItemMapper foodMapper = new FoodMapper((Food) item);
                view.render(foodMapper.toViewData());
            }
            System.out.println("");
        }
    }

}