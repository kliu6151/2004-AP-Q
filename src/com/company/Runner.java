package com.company;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        Dog dog = new Dog("Dog");
        LoudDog loudDog = new LoudDog("Loud Dog");

        System.out.println(cat.speak()); // → "meow"
        System.out.println(dog.speak()); // → "woof"
        System.out.println(loudDog.speak()); // → "woof woof"

        ArrayList<Pet> p = new ArrayList<>();
        p.add(cat);
        p.add(dog);
        p.add(loudDog);
        new Kennel(p).allSpeak();
    }
}

