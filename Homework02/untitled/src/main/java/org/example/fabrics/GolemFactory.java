package org.example.fabrics;

import org.example.enemy.Golem;
import org.example.Entity;
import org.example.enemy.Npc;

public class GolemFactory implements NpcCreation {
    @Override
    public Npc create() {
        return new Golem();
    }
}
