package org.example.heroes;

import org.example.Action;

public class Archer extends Hero implements Action {
    private static final String CLASS_HERO = "Archer";
    private static final double AGILITY = 0.6;
    private static final int CRITICAL_HIT = 300;
    private static final double CRITICAL_CHANCE = 0.4;
    private static final int DEF = 30;
    private static final int POWER = 100;
    private static final int HP = 300;
    public Archer() {
        super(DEF, POWER, HP, CLASS_HERO, AGILITY, CRITICAL_HIT, CRITICAL_CHANCE);
    }

    @Override
    public int attack() {
        double criticalDamage = random.nextDouble();
        if (criticalChance > criticalDamage){
            System.out.println("Лучник делает меткий выстрел\t(" + criticalHit + ")");
            return criticalHit;
        } else {
            System.out.println("Лучник пускает стрелу\t(" + power + ")");
            return power;
        }    }

    @Override
    public void takingDamage(int attack) {
        double agilityChance = random.nextDouble();
        if (agility > agilityChance) {
            System.out.println("Лучник уклонился от атаки");
        } else {
            hp -= (attack - def);
            System.out.println("Лучник получает под дых\tHP: " + hp);
            if (hp < 0) {
                isLive = false;
                dead();
            }
        }
    }

    @Override
    public boolean isLive() {
        return isLive;
    }

    @Override
    public void dead() {
        System.out.println("Лучник сложил голову");
    }
}
