package com.store.Store.store.decorators;

import com.store.Store.store.Item;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RibbonDecorator extends ItemDecorator{
    public Item item;

    public RibbonDecorator(Item item){
        setItem(item);
        setDescription("with ribbon!");
    }

    public double getPrice(){
        return 40 + item.getPrice();
    }
}
