package org.example.enemy;

import org.example.Action;
import org.example.Entity;

public abstract class Npc extends Entity implements Action {
    protected Npc(int def, int power, int hp) {
        super(def, power, hp);
    }
}
