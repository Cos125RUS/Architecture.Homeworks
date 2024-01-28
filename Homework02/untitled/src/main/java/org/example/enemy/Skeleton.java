package org.example.enemy;

import org.example.Action;

public class Skeleton extends Npc implements Action {
    private static final int DEF = 0;
    private static final int POWER = 15;
    private static final int HP = 100;

    public Skeleton() {
        super(DEF, POWER, HP);
    }

    @Override
    public int attack() {
        System.out.println("Скелет бьёт ржавым мечом\t(" + power + ")");
        return power;
    }

    @Override
    public void takingDamage(int attack) {
        hp -= (attack - def);
        System.out.println("Скелет получает по черепу\tHP: " + hp);
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
        System.out.println("Скелет рассыпался");
    }
}
