package com.enigma.oop.inheritance;

public class Block extends Rectangle {

    private Double height;


    public Block(Double length, Double width, Double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    public Double getSurfave() {
        return 2*((length*width) +(height*width));
    }

    @Override
    public Double getRound() {
        return length*height*width;
    }
}
