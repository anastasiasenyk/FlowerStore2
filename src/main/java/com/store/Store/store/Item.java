package com.store.Store.store;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Item {
    private String description;
    private double price;
}
