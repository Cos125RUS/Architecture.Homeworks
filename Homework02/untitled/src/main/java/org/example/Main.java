package org.example;

import org.example.enemy.Npc;
import org.example.fabrics.*;
import org.example.heroes.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Да начнётся приключение!");
        new Battle(new Choicer().getHero()).startAdventure();
    }
}