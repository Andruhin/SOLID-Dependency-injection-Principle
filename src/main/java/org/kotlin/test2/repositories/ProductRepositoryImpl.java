package org.kotlin.test2.repositories;

import org.kotlin.test2.data.Food;
import org.kotlin.test2.data.Item;
import org.kotlin.test2.data.Tool;
import org.kotlin.test2.data.Toy;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl {
    public NetworkRepositoryImpl networkRepository;
    public LocalDbRepositoryImpl localDbRepository;

    public ProductRepositoryImpl(NetworkRepositoryImpl networkRepository, LocalDbRepositoryImpl localDbRepository) {
        this.networkRepository = networkRepository;
        this.localDbRepository = localDbRepository;
    }

    public List<Item> getItems(boolean isInternetAvailable) {
        System.out.println("Retrieve Items from Repository");
        System.out.println("isInternetAvailable =" + isInternetAvailable);
        if (isInternetAvailable){
            return networkRepository.getItems();
        } else  {
            return localDbRepository.getItems();
        }
    }
}
