package com.store.Store.store;

import com.store.Store.flower.Flower;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FlowerPack extends Item {
    private Flower flower;
    private int amount;

    public FlowerPack(final Flower flowerNew, final int quantity) {
        setFlower(flowerNew);
        setAmount(quantity);
    }

}
