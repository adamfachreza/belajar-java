package com.enigma.oop.abstrak;

import java.util.Objects;

public class Circle extends Shape{

    private Integer radius;

    public Circle(Integer radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
// equals untuk ngebandingin valuenya, kalo g make equals yang di bandingin itu alamat memorynya
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(radius, circle.radius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
