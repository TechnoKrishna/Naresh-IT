package com.example.oop.elc;

import com.example.oop.blc.Fan;

public class FanTest {
    public static void main(String[] args) {
        Fan f = new Fan();

        f.name = "Ransom";
        f.coil = "1";
        f.wings = 3;

        f.switchOn();
        f.switchOff();

    }
}
