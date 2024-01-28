package org.example.fabrics;

import org.example.heroes.Hero;
import org.example.heroes.Knight;

public class KnightFactory implements HeroCreation{
    @Override
    public Hero create() {
        return new Knight();
    }
}
