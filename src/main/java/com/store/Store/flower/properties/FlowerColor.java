package com.store.Store.flower.properties;

public enum FlowerColor {
    RED("red"),
    ORANGE("orange"),
    PURPLE("purple"),
    BROWN("brown"),
    BLUE("blue"),
    WHITE("white"),
    BLACK("black"),
    ;
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

}
