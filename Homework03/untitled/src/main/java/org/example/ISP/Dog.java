package org.example.ISP;

public class Dog implements Biter{
    @Override
    public void bite() {
        System.out.println("Пёс кусается");
    }
}
