package org.example.heroes;

import org.example.Action;
import org.example.Entity;

import java.util.Random;

public abstract class Hero extends Entity implements Action {
    protected String classHero;
    protected double agility;
    protected int criticalHit;
    protected double criticalChance;
    protected Random random;

    protected Hero(int def, int power, int hp, String classHero, double agility,
                   int criticalHit, double criticalChance) {
        super(def, power, hp);
        this.classHero = classHero;
        this.agility = agility;
        this.criticalHit = criticalHit;
        this.criticalChance = criticalChance;
        random = new Random();
    }
}
