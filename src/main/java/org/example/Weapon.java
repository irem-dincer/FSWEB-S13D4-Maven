package org.example;

public enum Weapon {

SWORD(2, 5.1),
    BOW(8, 7.5),
    AXE(15, 3.8);


    private int damage;
    private double attackSpeed;

    Weapon(int damage , double attackSpeed){ //Create an Enum constructor
this.damage=damage;
this.attackSpeed=attackSpeed;
    }

    public int getDamage(){
        return  this.damage;
    }

    public double getAttackSpeed(){
        return this.attackSpeed;

    }

}
