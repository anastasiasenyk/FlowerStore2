package com.store.Store.flower.properties.types;

import com.store.Store.flower.Flower;
import com.store.Store.flower.properties.FlowerColor;
import com.store.Store.flower.properties.FlowerType;


public class Rose extends Flower {
    public static final int ROSE_SEPAL_LENGTH = 7;
    public static final int COEFF = 5;

    public Rose() {
        setFlowerType(FlowerType.ROSE);
        setColor(FlowerColor.RED);
        setSepalLength(ROSE_SEPAL_LENGTH);
        setPrice(getSepalLength()*COEFF);
    }
}

