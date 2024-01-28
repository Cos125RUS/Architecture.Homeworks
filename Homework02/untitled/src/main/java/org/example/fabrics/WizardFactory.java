package org.example.fabrics;

import org.example.heroes.Hero;
import org.example.heroes.Wizard;

public class WizardFactory implements HeroCreation{
    @Override
    public Hero create() {
        return new Wizard();
    }
}
