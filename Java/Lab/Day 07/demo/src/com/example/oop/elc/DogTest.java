package com.example.oop.elc;

import com.example.oop.blc.Dog;

public class DogTest {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.name = "Tommy";
        d.height = 3.29;
        d.age = 4;

        d.getDog();
        d.bark();



    }
}
