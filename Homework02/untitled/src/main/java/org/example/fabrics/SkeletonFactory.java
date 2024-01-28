package org.example.fabrics;

import org.example.Entity;
import org.example.enemy.Npc;
import org.example.enemy.Skeleton;

public class SkeletonFactory implements NpcCreation {
    @Override
    public Npc create() {
        return new Skeleton();
    }
}
