package org.example.heroes;

import org.example.Action;

public class Wizard extends Hero implements Action {
    private static final String CLASS_HERO = "Wizard";
    private static final double AGILITY = 0.4;
    private static final int CRITICAL_HIT = 500;
    private static final double CRITICAL_CHANCE = 0.1;
    private static final int DEF = 10;
    private static final int POWER = 150;
    private static final int HP = 200;
    public Wizard() {
        super(DEF, POWER, HP, CLASS_HERO, AGILITY, CRITICAL_HIT, CRITICAL_CHANCE);
    }

    @Override
    public int attack() {
        double criticalDamage = random.nextDouble();
        if (criticalChance > criticalDamage){
            System.out.println("Волшебник кастует сильное заклинание\t(" + criticalHit + ")");
            return criticalHit;
        } else {
            System.out.println("Волшебник пускает огненный шар\t(" + power + ")");
            return power;
        }    }

    @Override
    public void takingDamage(int attack) {
        double agilityChance = random.nextDouble();
        if (agility > agilityChance) {
            System.out.println("Волшебник уклонился от атаки");
        } else {
            hp -= (attack - def);
            System.out.println("Волшебник получает по бороде\tHP: " + hp);
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
        System.out.println("Волшебник испустил дух");
    }
}
