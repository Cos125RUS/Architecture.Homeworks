package org.example.OCP;

public abstract class AbstractAnimal {
    String name;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    public String say() {
        return "voice";
    }
}
