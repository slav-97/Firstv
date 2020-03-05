package by.tut.lect7;

public abstract class Hero {
    private String name;
    private int damage;

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public abstract void attackEnemy(Enemy enemy);
}
