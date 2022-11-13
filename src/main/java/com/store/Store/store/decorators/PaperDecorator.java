package com.store.Store.store.decorators;


import com.store.Store.store.Item;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PaperDecorator extends ItemDecorator {
    private Item item;

    public PaperDecorator(Item item){
        setItem(item);
        setDescription("Red Hot Chilli (?Papers)!");
    }

    public double getPrice(){
        return 13 + item.getPrice();
    }
}
