package com.enigma.oop.polymorphism;

public class Monster implements Hitable{
    private String name;
    private Integer hp;
    private Integer damage;

    public Monster(String name, Integer hp, Integer damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public void receiveDamage(Heroes heroes){
        this.hp -= heroes.getBaseDamage();
    }

    public void attack(Heroes heroes){
        heroes.getHit(this.damage);
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                '}';
    }
}
