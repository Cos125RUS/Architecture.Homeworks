package org.example;

import org.example.fabrics.ArcherFactory;
import org.example.fabrics.HeroCreation;
import org.example.fabrics.KnightFactory;
import org.example.fabrics.WizardFactory;
import org.example.heroes.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Choicer {
    private final List<HeroCreation> heroCreations;
    private final Random random;

    public Choicer() {
        random = new Random();
        heroCreations = getHeroFactories();
    }

    private List<HeroCreation> getHeroFactories() {
        List<HeroCreation> heroCreations = new ArrayList<>();
        heroCreations.add(new KnightFactory());
        heroCreations.add(new ArcherFactory());
        heroCreations.add(new WizardFactory());
        return heroCreations;
    }

    public Hero getHero() {
        return heroCreations.get(Math.abs(random.nextInt() % heroCreations.size())).create();
    }
}
