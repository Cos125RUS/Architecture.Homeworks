package org.example.OCP;

import org.example.SRC.Animal;

public class MainOCP {
    public static void main(String[] args) {
        AbstractAnimal muchtar = new Dog("Muchtar");
        AbstractAnimal pushok = new Cat("Pushok");
        System.out.println(muchtar.say());
        System.out.println(pushok.say());
    }
}