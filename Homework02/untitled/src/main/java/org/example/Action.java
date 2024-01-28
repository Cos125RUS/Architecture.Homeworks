package org.example;

public interface Action {
    int attack();
    void takingDamage (int attack);
    boolean isLive();
    void dead();
}
