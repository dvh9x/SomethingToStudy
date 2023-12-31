package com.hido.somethingtostudy.JavaAndJava.P10_Stream;

import java.util.ArrayList;

public class Repository {
    ArrayList<Animal> list;

    public Repository() {
        list = new ArrayList<Animal>();
        list.add(new Animal("Cat", 4, "White"));
        list.add(new Animal("Dog", 4, "Black"));
        list.add(new Animal("Chicken", 2, "Yellow"));
        list.add(new Animal("Crab", 8, "Red"));
        list.add(new Animal("Snake", 0, "Green"));
        list.add(new Animal("Duck", 2, "White"));
        list.add(new Animal("Mouse", 4, "Gray"));
    }

    public void printList() {
        list.forEach(animal -> System.out.println(animal));
    }

    public void getAnimal4Legs() {
        list.stream()
                .filter(animal -> animal.getLegs() == 4)
                .forEach(animal -> System.out.println(animal));
    }

    public long countAnimal4Legs() {
        long count = 0;
        count = list.stream()
                .filter(animal -> animal.getLegs() == 4)
                .count();
        return count;
    }
}
