package com.store.Store.store.decorators;


import com.store.Store.store.Item;

public class PaperDecorator extends ItemDecorator {
    private Item item;

    public PaperDecorator(){
        setDescription("Red Hot Chilli (?Papers)!");
    }

    public double getPrice(){
        return 13 + item.getPrice();
    }
}
