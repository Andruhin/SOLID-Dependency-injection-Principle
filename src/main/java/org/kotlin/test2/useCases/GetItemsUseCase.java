package org.kotlin.test2.useCases;

import org.kotlin.test2.data.Item;
import org.kotlin.test2.repositories.ProductRepositoryImpl;

import java.util.List;

public class GetItemsUseCase {
    private ProductRepositoryImpl productRepository;

    public GetItemsUseCase(ProductRepositoryImpl productRepository) {
        this.productRepository = productRepository;
    }

    public List<Item> getItems(boolean isInternetAvailable){
        return productRepository.getItems(isInternetAvailable);
    }
}
