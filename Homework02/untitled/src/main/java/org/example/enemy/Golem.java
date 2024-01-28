package org.example.enemy;

import org.example.Action;

public class Golem extends Npc implements Action {
    private static final int DEF = 30;
    private static final int POWER = 30;
    private static final int HP = 300;

    public Golem() {
        super(DEF, POWER, HP);
    }

    @Override
    public int attack() {
        System.out.println("Голем долбит глиняной лапой\t(" + power + ")");
        return power;
    }

    @Override
    public void takingDamage(int attack) {
        hp -= (attack - def);
        System.out.println("Голем получает по горшку\tHP: " + hp);
        if (hp < 0) {
            isLive = false;
            dead();
        }
    }

    @Override
    public boolean isLive() {
        return isLive;
    }

    @Override
    public void dead() {
        System.out.println("Голем стёрт в порошок");
    }
}
