package com.enigma.oop.inheritance;

public class Rectangle {
    protected Double length;
    protected Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public Double getSurfave(){
        return this.width * this.length;
    }

    public Double getRound(){
        return 2 *(this.length * this.width);
    }
}
