package org.kotlin.test2.repositories;

import org.kotlin.test2.useCases.GetItemsUseCase;

public class ServiceLocator {

    private NetworkRepositoryImpl provideNetworkRepository(){
        return new NetworkRepositoryImpl();
    }

    private LocalDbRepositoryImpl provideLocalDbRepository(){
        return new LocalDbRepositoryImpl();
    }

    private ProductRepositoryImpl provideProductRepository(){
        return new ProductRepositoryImpl(provideNetworkRepository(), provideLocalDbRepository());
    }

    public GetItemsUseCase provideGetItemsUseCase(){
        return new GetItemsUseCase(provideProductRepository());
    }

}
