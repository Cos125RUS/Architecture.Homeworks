package org.example;

import org.example.enemy.Npc;
import org.example.fabrics.GolemFactory;
import org.example.fabrics.NpcCreation;
import org.example.fabrics.OrcFactory;
import org.example.fabrics.SkeletonFactory;
import org.example.heroes.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Battle implements Mechanics{
    private final List<NpcCreation> npcCreations;
    private final Hero hero;
    private Random random;

    public Battle(Hero hero) {
        this.hero = hero;
        npcCreations = getNpsFactories();
        random = new Random();
    }


    @Override
    public List<NpcCreation> getNpsFactories() {
        List<NpcCreation> npcCreations = new ArrayList<>();
        npcCreations.add(new OrcFactory());
        npcCreations.add(new GolemFactory());
        npcCreations.add(new SkeletonFactory());
        return npcCreations;
    }

    @Override
    public void startAdventure() {
        while (hero.isLive) {
            Npc npc = npcCreations.get(Math.abs(random.nextInt() % npcCreations.size())).create();
            fight(npc);
        }
    }

    @Override
    public void fight(Npc enemy) {
        while (enemy.isLive){
            hero.takingDamage(enemy.attack());
            if (!hero.isLive){
                gameOver();
                return;
            }
            enemy.takingDamage(hero.attack());
        }
    }

    @Override
    public void gameOver() {
        System.out.println("Game over");
    }
}
