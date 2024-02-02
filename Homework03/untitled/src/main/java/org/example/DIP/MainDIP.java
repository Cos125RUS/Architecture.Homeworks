package org.example.DIP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainDIP {
    public static void main(String[] args) {
        List<Cuteness> cutenesses = List.of(new Cat(), new Dog());
        cutenesses.forEach(Cuteness::beNice);
    }
}
