package by.tut.lect7;

import java.util.*;

public class BattleGround {
    Random rand;
    Scanner in;
    Mage player;
    private int healthPotionDropChance;
    boolean running;

    public static void main (String[] args){
        BattleGround game = new BattleGround();
        game.run();
        System.out.println("###############################");
        System.out.println("GAME OVER");
        System.out.println("###############################");
    }

    public BattleGround(){
        in = new Scanner(System.in);
        rand = new Random();
        System.out.println("Welcome to the BattleGround Game!");
        player = new Mage();
        healthPotionDropChance = 50;
    }

    public void run(){
        running = true;
        GAME:
        while (running) {
            System.out.println("---------------------------------------------");
            Enemy enemy = new Enemy();
            Zombie zombie = new Zombie();
            String enemyType2 = zombie.getType();
            String enemyType = enemy.getType();
            System.out.println("\t#" + enemyType + " appeared! #\n");
            System.out.println("\t#" + enemyType2 + " appeared! #\n");
            while(enemy.getHealth() > 0 && zombie.getHealth() > 0) {
                System.out.println("\tHero HP: " + player.getHealth());
                System.out.println("\t+" + enemyType + " HP: " + enemy.getHealth());
                System.out.println("\t+" + enemyType2 + " HP: " + zombie.getHealth());
                int damageTaken = enemy.attackEnemy();
                int damageTaken2 = zombie.attackEnemy();
                int damageProduced = player.attackEnemy();
                enemy.takeDamage(damageProduced);
                zombie.takeDamage(damageProduced);
                player.takeDamage(damageTaken);
                System.out.println("\t> Hero strike the " + enemyType + " for " + damageProduced + " damage.");
                System.out.println("\t> Hero strike the " + enemyType2 + " for " + damageProduced + " damage.");
                System.out.println("\t> Hero receive " + damageTaken + " in retaliation!");
                if(player.getHealth() < 1) {
                    System.out.println(">t Hero have taken too much damage, Hero are to weak to go on!");
                    break;
                }
            }
            if(player.getHealth() < 1) {
                System.out.println("Hero limp out of the dungeon, weak from battle.");
                break;
            }
            System.out.println("---------------------------------------------");
            System.out.println(" # " + enemyType + " was defeated! #");
            System.out.println(" # " + enemyType2 + " was defeated! #");
            System.out.println(" # Hero have " + player.getHealth() + " HP left. #");
            if(rand.nextInt(100) < healthPotionDropChance) {
                player.pickUpHealthPotion();
                System.out.println(" # The " + enemyType + " dropped a health potion! #");
                System.out.println(" # Hero now have " + player.getNumHealthPotions() + "health potion(s). # ");
            }
            System.out.println("---------------------------------------------");
            break;
        }
    }
}
