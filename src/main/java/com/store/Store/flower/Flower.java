package com.store.Store.flower;

import com.store.Store.flower.properties.FlowerColor;
import com.store.Store.flower.properties.FlowerType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity @Table
public class Flower {
    @Id
    @GeneratedValue
    private int id;
    private double sepalLength;
//    @Transient
    private double price;
    public static final int COEFF = 5;
    @Enumerated(EnumType.STRING)
    private FlowerColor color;
    @Enumerated(EnumType.STRING)
    private FlowerType flowerType;

    public Flower(FlowerType type, FlowerColor color, double sepalLength, double price) {
        this.flowerType = type;
        this.color = color;
        this.sepalLength = sepalLength;
        this.price = price;
    }

    public Flower(){
    }

    public Flower(int id, FlowerType type, FlowerColor color, double sepalLength, double price) {
        this.id = id;
        this.flowerType = type;
        this.color = color;
        this.sepalLength = sepalLength;
        this.price = price;

    }
}
