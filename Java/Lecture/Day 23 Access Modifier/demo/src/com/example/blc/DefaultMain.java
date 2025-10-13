package com.example.blc;

public class DefaultMain {
    public static void main(String[] args) {
        DefaultAM am = new DefaultAM();
        System.out.println(am.x); // ✅ allowed (same package)
    }
}
