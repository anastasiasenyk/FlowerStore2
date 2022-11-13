package com.store.Store.store.decorators;

import com.store.Store.store.Item;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class ItemDecorator extends Item {
    private String description;
}
