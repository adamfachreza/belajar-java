package com.enigma.oop.inheritance;

public class Cat extends Animals{
   private String desc;
   private String name;

    public Cat(String type, Integer age,String desc,String name) {
        super(type, age);
        this.desc = desc;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age  +
                ", desc='"+ name + " " + desc + '\'' +
                '}';
    }
}
