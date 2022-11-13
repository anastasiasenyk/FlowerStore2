package com.store.Store.store;

import com.store.Store.flower.Flower;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Objects;


@Setter @Getter
public class FlowerBucket extends Item {
    private double bucketPrice;
    private ArrayList<FlowerPack> bucket = new ArrayList<>();
    public void addPack(final FlowerPack pack) {
        bucket.add(pack);
        setBucketPrice(getBucketPrice() + pack.getAmount() * pack.getFlower().getPrice());
    }
    public boolean searchFlower(Flower flower){
        for (FlowerPack pack : bucket){
            if (Objects.equals(pack.getFlower().toString(), flower.toString())){
                return true;
            }
        }
        return false;
    }
}

