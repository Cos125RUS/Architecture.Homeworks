package org.example;

public abstract class Entity {
    protected final int def;
    protected final int power;
    protected int hp;
    protected boolean isLive;

    protected Entity(int def, int power, int hp) {
        this.def = def;
        this.power = power;
        this.hp = hp;
        isLive = true;
    }

}
