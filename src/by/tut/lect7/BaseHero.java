package by.tut.lect7;

public class BaseHero extends Hero{
    public BaseHero(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamage());
        System.out.println(getName()+" attack");
    }
}
