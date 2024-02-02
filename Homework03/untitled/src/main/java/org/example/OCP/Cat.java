package org.example.OCP;


public class Cat extends AbstractAnimal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Mur";
    }
}
