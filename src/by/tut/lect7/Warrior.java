package by.tut.lect7;

public class Warrior extends Hero{
    private int numHealthPotions;
    private int healthPotionHealAmount;
    private int healthPotionDropChance;

    public Warrior(){
        super(100,50);
        numHealthPotions = 3;
        healthPotionHealAmount = 30;
    }

    public void applyPotion(){
        health += healthPotionHealAmount;
        numHealthPotions--;
    }

    public void pickUpHealthPotion(){
        numHealthPotions++;
    }

    public int getNumHealthPotions(){
        return numHealthPotions;
    }

    public int getHealthPotionHealAmount(){
        return healthPotionHealAmount;
    }

    public Warrior(String name) {
        super();
    }

    @Override
    public void display() {

    }


    public String getName(String name){
        return name;
    }


    interface Mortal {
        public boolean isAlive();
    }
}
