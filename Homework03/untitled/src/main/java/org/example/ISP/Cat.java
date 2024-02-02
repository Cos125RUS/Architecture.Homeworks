package org.example.ISP;


public class Cat implements Scratcher, Biter{
    @Override
    public void scratch() {
        System.out.println("Кот царапается!");
    }

    @Override
    public void bite() {
        System.out.println("Кот кусается!");
    }
}
