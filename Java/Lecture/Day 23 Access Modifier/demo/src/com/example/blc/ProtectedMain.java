package com.example.blc;

public class ProtectedMain extends ProtectedAM { // inheritance
    public static void main(String[] args) {
        ProtectedAM protectedAM = new ProtectedAM();
        System.out.println(protectedAM.x); // ✅ allowed through inheritance
    }
}
