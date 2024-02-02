package org.example.OCP;

public class Dog extends AbstractAnimal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Gav";
    }
}
