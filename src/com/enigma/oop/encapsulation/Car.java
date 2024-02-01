package com.enigma.oop.encapsulation;

public class Car {
   private String color;
    private String brand;
    private Integer fuel;
    private Boolean isStart;

    public Car(String color, String brand, Integer fuel) {
        this.color = color;
        this.brand = brand;
        this.fuel = fuel;
        this.isStart = false;
    }

    public Car() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public Boolean getStart() {
        return isStart;
    }

    public void setStart(Boolean start) {
        isStart = start;
    }

    public void engineStart(){
        if(this.fuel == null) {
            System.out.println("Data Is Null");
        }else if (this.fuel > 0){
            this.isStart = true;
            System.out.println(isStart.toString());
        }else{
            System.out.println("Insufficient fuel");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", fuel=" + fuel +
                '}';
    }
}
