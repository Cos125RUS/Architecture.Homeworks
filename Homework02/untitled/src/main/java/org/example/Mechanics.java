package org.example;

import org.example.enemy.Npc;
import org.example.fabrics.NpcCreation;
import org.example.heroes.Hero;

import java.util.List;

public interface Mechanics {
    List<NpcCreation> getNpsFactories();
    void startAdventure();
    void fight(Npc enemy);
    void gameOver();
}
