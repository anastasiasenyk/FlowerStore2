package com.store.Store.store;

import com.store.Store.flower.Flower;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


@Getter
@Setter
public class Store {
    private ArrayList<FlowerBucket> store = new ArrayList<FlowerBucket>();
    public void addBucket(final FlowerBucket bucket) {
        store.add(bucket);
    }

    public boolean searchFlowers(final Flower flower, final int amount) {
        int counter = 0;
        for (FlowerBucket bucket: store) {
            for (FlowerPack pack: bucket.getBucket()) {
                if (pack.getFlower().getFlowerType()
                        == flower.getFlowerType()) {
                    counter += pack.getAmount();
                }
                if (counter >= amount) {
                    return true;
                }
            }
        }
        return false;
    }
}
