package org.example.LSP;

public class MainLSP {
    public static void main(String[] args) {
        AbstractAnimal muchtar = new Dog("Muchtar");
        AbstractAnimal pushok = new Cat("Pushok");
        System.out.println(muchtar.say());
        System.out.println(pushok.say());
    }
}
