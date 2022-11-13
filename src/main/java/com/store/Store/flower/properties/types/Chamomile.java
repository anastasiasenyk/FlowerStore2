package com.store.Store.flower.properties.types;

import com.store.Store.flower.Flower;
import com.store.Store.flower.properties.FlowerColor;
import com.store.Store.flower.properties.FlowerType;

public class Chamomile extends Flower {
    public static final int CHAMOMILE_SEPAL_LENGTH = 3;
    public static final int COEFF = 5;

    public Chamomile() {
        setFlowerType(FlowerType.CHAMOMILE);
        setColor(FlowerColor.WHITE);
        setSepalLength(CHAMOMILE_SEPAL_LENGTH);
        setPrice(getSepalLength()*COEFF);
    }
}
