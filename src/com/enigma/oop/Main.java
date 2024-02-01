package com.enigma.oop;

import com.enigma.oop.polymorphism.Heroes;
import com.enigma.oop.polymorphism.Monster;
import com.enigma.oop.polymorphism.Weapon;

public class Main {
    public static void main(String[] args) {

//        System.out.println(bmw.color + " " + bmw.brand);
//        System.out.println(honda.color + " " + honda.brand);
//        honda.engineStart();
//        System.out.println("honda years = " + honda);
//        System.out.println("Memory address honda = " + System.identityHashCode(honda.year));
//        System.out.println("bmw years = " + bmw);
//        System.out.println("Memory address bmw = " + System.identityHashCode(bmw.year));
//        Car honda = new Car("black","jazz",10);
//        Car bmw = new Car(); // eksekusi konstraktor kosong di class car
//        Car bmw = new Car();
//        bmw.setColor("black");
//        System.out.println(bmw.getColor());
//        bmw.engineStart();

//        Food nasiGoreng = new Food();
//        nasiGoreng.setName("Nasi Goreng");
//        nasiGoreng.setPrice(0);

//        Rectangle segiPanjang = new Rectangle(10.0,5.0,3.0);
//          segiPanjang.result();
//Block block = new Block(5.0,5.0,2.0);
//        System.out.println(block.getRound());

//        Cat cat = new Cat("mamalia",1,"from another planet","Cat");
//        System.out.println(cat);

        Heroes zilong = new Heroes("zilong", 1000, 450, 50, "Team A");
        Heroes nana = new Heroes("nana", 850, 600, 40,"Team B");
        Heroes rafaela = new Heroes("rafaela", 850, 600, 40,"Team A");
        Monster lord = new Monster("lord", 10000, 100);
        Weapon pedang = new Weapon("pedang",100);
//        System.out.println(zilong);
//        System.out.println(nana);
//        zilong.attack(nana);
//        nana.attack(zilong);
//        System.out.println(nana);
//        System.out.println(zilong);
//        System.out.println(rafaela);
//        rafaela.heal(zilong);
//        System.out.println(zilong);
//        System.out.println(rafaela);
//        System.out.println(lord);
//        System.out.println(zilong);
//        System.out.println(nana);
//        zilong.attack(lord);
//        System.out.println(lord);
//        zilong.attack(nana);
//        System.out.println(nana);
//        lord.attack(zilong);
//        System.out.println(zilong);
//        zilong.equipWeapon(pedang);
//        System.out.println(zilong);
//        zilong.attack(lord);
//        System.out.println(lord);
//        zilong.unequipWeapon(pedang);
//        System.out.println(zilong);
        System.out.println(rafaela);
        System.out.println(zilong);
        System.out.println(nana);
        zilong.receiveDamage(rafaela);
        zilong.receiveDamage(nana);
        zilong.attack(nana);
        System.out.println(nana);
        System.out.println(zilong);

    }
}
