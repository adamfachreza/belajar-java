package com.enigma.oop.encapsulation;

public class Rectangle {

    protected Double lenght;
    protected Double width;
    protected Double height;

    public Rectangle() {
    }

    public Rectangle(Double lenght, Double width, Double height) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public Double getSurface() {
        return this.lenght * this.width;
    }

    public Double getRound() {
        return 2*(this.lenght * this.width);
    }
    public void result(){
        Double surface =  this.lenght * this.width;
        Double round = 2*(this.lenght * this.width);
        System.out.println("luas segi panjang " + surface + " keliling segi panjang " + round);
    }
}
