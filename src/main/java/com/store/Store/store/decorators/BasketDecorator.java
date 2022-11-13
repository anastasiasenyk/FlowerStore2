package com.store.Store.store.decorators;

import com.store.Store.store.Item;

public class BasketDecorator extends ItemDecorator{
    public Item item;

    public BasketDecorator(){
        setDescription("with bascet!");
    }

    public double getPrice(){
        return 4 + item.getPrice();
    }
}
