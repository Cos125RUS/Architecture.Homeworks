package org.example.fabrics;

import org.example.heroes.Archer;
import org.example.heroes.Hero;

public class ArcherFactory implements HeroCreation{
    @Override
    public Hero create() {
        return new Archer();
    }
}
