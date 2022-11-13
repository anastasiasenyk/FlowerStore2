package com.store.Store.store.decorators;

import com.store.Store.store.Item;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BasketDecorator extends ItemDecorator{
    public Item item;

    public BasketDecorator(Item item){
        setItem(item);
        setDescription("with bascet!");
    }

    public double getPrice(){
        return 4 + item.getPrice();
    }
}
