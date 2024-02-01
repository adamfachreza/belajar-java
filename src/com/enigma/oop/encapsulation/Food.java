package com.enigma.oop.encapsulation;

public class Food {
    private String name;
    private Integer price;
    private Integer money;

    public Food(String name, Integer price, Integer money) {
        this.name = name;
        this.price = price;
        this.money = money;
    }

    public Food() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
        if(this.price == null){
            System.out.println("price is null");
        } else if (this.price > 0) {
            System.out.println("bisa beli makan");
        }else {
            System.out.println("tidak bisa membeli makanan");
        }


    }
}
