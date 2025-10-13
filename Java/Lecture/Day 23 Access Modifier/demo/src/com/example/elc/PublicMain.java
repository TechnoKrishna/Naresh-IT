package com.example.elc;

import com.example.blc.PublicAM;

public class PublicMain {
    public static void main(String[] args) {
        PublicAM s = new PublicAM();
        System.out.println(s.roll + " " + s.name); // ✅ accessible from anywhere
    }
}
