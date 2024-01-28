package org.example.heroes;

import org.example.Action;

public class Knight extends Hero implements Action {
    private static final String CLASS_HERO = "Knight";
    private static final double AGILITY = 0.2;
    private static final int CRITICAL_HIT = 150;
    private static final double CRITICAL_CHANCE = 0.2;
    private static final int DEF = 100;
    private static final int POWER = 50;
    private static final int HP = 500;

    public Knight() {
        super(DEF, POWER, HP, CLASS_HERO, AGILITY, CRITICAL_HIT, CRITICAL_CHANCE);
    }

    @Override
    public int attack() {
        double criticalDamage = random.nextDouble();
        if (criticalChance > criticalDamage){
            System.out.println("Рыцарь рубит со всей силы\t(" + criticalHit + ")");
            return criticalHit;
        } else {
            System.out.println("Рыцарь бьёт врага мечом\t(" + power + ")");
            return power;
        }
    }

    @Override
    public void takingDamage(int attack) {
        double agilityChance = random.nextDouble();
        if (agility > agilityChance) {
            System.out.println("Рыцарь уклонился от атаки, скрипя латами");
        } else {
            hp -= (attack - def);
            System.out.println("Рыцарь получает по жестяной броне\tHP: " + hp);
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
        System.out.println("Рыцарь пал смертью храбрых");
    }
}
