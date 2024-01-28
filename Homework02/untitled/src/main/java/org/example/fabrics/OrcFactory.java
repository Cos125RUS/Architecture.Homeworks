package org.example.fabrics;

import org.example.Entity;
import org.example.enemy.Npc;
import org.example.enemy.Orc;

public class OrcFactory implements NpcCreation {
    @Override
    public Npc create() {
        return new Orc();
    }
}
