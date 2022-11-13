package com.store.Store.store.decorators;

import com.store.Store.store.Item;

public class RibbonDecorator extends ItemDecorator{
    public Item item;

    public RibbonDecorator(){
        setDescription("with ribbon!");
    }

    public double getPrice(){
        return 40 + item.getPrice();
    }
}
