package by.tut.lect7;

public class Zombie extends Enemy{
    private String name =  "Zombie";
    private String type2;
    private int maxHealth;
    private int health;
    private int attackDamage;


    public Zombie(){

        super(90,20);
        maxHealth = 70;
        attackDamage = 20;
        health = rand.nextInt(maxHealth);
        type2 = name;
    }

    public String getType(){
        return type2;
    }

    @Override
    public String getName(String name) {
        return name;
    }
}
