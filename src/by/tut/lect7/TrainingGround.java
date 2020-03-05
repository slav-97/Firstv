package by.tut.lect7;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(1000);
        Wizard wizard = new Wizard("Wizard", 30);
        wizard.attackEnemy(enemy);
        Archer archer = new Archer("Archer", 30);
        archer.attackEnemy(enemy);
        Warrior warrior = new Warrior("Warrior", 40);
        warrior.attackEnemy(enemy);
        System.out.println(enemy.getHealth());
    }
}
