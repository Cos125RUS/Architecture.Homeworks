package org.example.LSP;

public abstract class AbstractAnimal {
    String name;
    String voice;

    public AbstractAnimal(String name,String voice) {
        this.name = name;
        this.voice = voice;
    }

    public String say() {
        return voice;
    }
}
