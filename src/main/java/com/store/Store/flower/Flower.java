package com.store.Store.flower;

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
    private String color;

    public Flower(String color, double sepalLength, double price) {
        this.color = color;
        this.sepalLength = sepalLength;
        this.price = price;
    }

    public Flower(){
    }

    public Flower(int id, String color, double sepalLength, double price) {
        this.id = id;
        this.sepalLength = sepalLength;
        this.price = price;
        this.color = color;
    }

//    public Flower(String color,
//                  double sepalLength) {
//        this.sepalLength = sepalLength;
//        this.color = color;
//    }

//    public Flower(int id,
//                  String color,
//                  double sepalLength) {
//        this.id = id;
//        this.sepalLength = sepalLength;
//        this.color = color;
//    }

    public void getPrice() {
        this.price = COEFF*this.sepalLength;
    }
}
