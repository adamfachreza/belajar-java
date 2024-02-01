package com.enigma.oop.polymorphism;

public class Heroes implements Hitable{
    private String name;
    private Integer hp;
    private Integer mana;
    private Integer baseDamage;
    private String team;

    public Heroes(String name, Integer hp, Integer mana, Integer baseDamage, String team) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.baseDamage = baseDamage;
        this.team = team;
    }

    public Integer getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(Integer baseDamage) {
        this.baseDamage = baseDamage;
    }
    public void getHit(Integer damage){
        this.hp -= damage;
    }

    public String getTeam() {
        return team;
    }

    public void attack(Monster monster){
        monster.receiveDamage(this);
    }

    public void heal(Heroes heroes){
        heroes.getHeal(this);
        this.mana /=2;
    }
    private void getHeal(Heroes heroes){
        this.hp += this.mana;
    }

    public void equipWeapon(Weapon weapon){
         this.baseDamage += weapon.getDamage();
    }
    public void unequipWeapon(Weapon weapon){
         this.baseDamage -= weapon.getDamage();
    }
    @Override
    public void receiveDamage(Heroes heroes) {
        if (heroes != null && heroes.getTeam().equals(this.getTeam())) {
            System.out.println("Cannot attack a team member!");
            return;
        }
        heroes.getHit(this.baseDamage);
    }
    public void attack(Hitable hitable){
        hitable.receiveDamage(this);
    }

    @Override
    public String toString() {
        return "Heroes{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mana=" + mana +
                ", baseDamage=" + baseDamage +
                ", team='" + team + '\'' +
                '}';
    }


}
