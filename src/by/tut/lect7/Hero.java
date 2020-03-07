package by.tut.lect7;

import java.util.*;

public abstract class Hero {
    Random rand;

    int health;
    int attackDamage;


    public Hero(int health, int attackDamage){
        rand = new Random();
        this.health = health;
        this.attackDamage = attackDamage;
    }

    public int attackEnemy(){
        return rand.nextInt(attackDamage);
    }

    public void takeDamage(int damage){
        health -= damage;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getDamage(){
        return attackDamage;
    }
    private String name;
    public Hero(String name) {
        this.name = name;
    }

    public abstract void display ();

    public Hero() {
    }


    public String getName(String name) {
        return this.name;
    }
}
