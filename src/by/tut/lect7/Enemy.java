package by.tut.lect7;

public class Enemy extends Hero{
    private String name = "Bulkin";
    private String type;
    private int maxHealth;



    public Enemy() {

        super(150, 15);
        maxHealth = 90;
        attackDamage = 5;
        health = rand.nextInt(maxHealth);
        type = name;
    }

    public Enemy(int health, int attackDamage) {
        super(health, attackDamage);
    }

    @Override
    public void display() {

    }

    public String getType() {
        return type;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
