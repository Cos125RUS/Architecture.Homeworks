package org.example.SRC;

public class MainSRC {
    public static void main(String[] args) {
        Animal sam = new Animal("Sam");
        Groomer groomer = new Groomer();
        groomer.haircut(sam);
    }
}
