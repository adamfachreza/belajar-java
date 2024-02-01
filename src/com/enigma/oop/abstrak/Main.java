package com.enigma.oop.abstrak;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Circle circle = new Circle(2);
//        System.out.println(circle.equals(new Circle(2)));

//        circle.draw();
//        circle.display();

//        Square square = new Square();
//        square.draw();
//        square.display();
        Set<Circle> circleSet = new HashSet<>();
        circleSet.add(new Circle(10));
        circleSet.add(new Circle(30));
        circleSet.add(new Circle(20));
        circleSet.add(new Circle(1));
        circleSet.add(new Circle(10));
        for(Circle circle : circleSet){
            System.out.println(circle.toString());
        }
        System.out.println("Size : " + circleSet.size());

    }
}
