package org.example.enemy;

import org.example.Action;

public class Orc extends Npc implements Action {
    private static final int DEF = 10;
    private static final int POWER = 50;
    private static final int HP = 200;

    public Orc() {
        super(DEF, POWER, HP);
    }

    public int attack() {
        System.out.println("Орк лупит топором\t(" + power + ")");
        return power;
    }

    public void takingDamage (int attack) {
        hp -= (attack - def);
        System.out.println("Орк получает по зелёной роже\tHP: " + hp);
        if (hp < 0) {
            isLive = false;
            dead();
        }
    }

    public boolean isLive() {
        return isLive;
    }

    public void dead() {
        System.out.println("Орк повержен");
    }
}
