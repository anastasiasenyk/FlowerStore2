package com.store.Store.flower.properties.types;

import com.store.Store.flower.Flower;
import com.store.Store.flower.properties.FlowerColor;
import com.store.Store.flower.properties.FlowerType;

import javax.persistence.Entity;

@Entity
public class Tulip extends Flower {
    public static final int TULIP_SEPAL_LENGTH = 11;
    public static final int COEFF = 5;

    public Tulip(int id) {
        setId(id);
        setFlowerType(FlowerType.TULIP);
        setColor(FlowerColor.BLUE);
        setSepalLength(TULIP_SEPAL_LENGTH);
        setPrice(getSepalLength()*COEFF);
    }

    public Tulip(){
        setFlowerType(FlowerType.TULIP);
        setColor(FlowerColor.BLUE);
        setSepalLength(TULIP_SEPAL_LENGTH);
        setPrice(getSepalLength()*COEFF);
    }
}
