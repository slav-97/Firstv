package by.tut.lect7;

public class Enemy {
    private int health;


    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int takeDamage(int damage) {
        health = getHealth() - damage;
        return health;
    }
}
