package com.example.elc;

class LIC {
    final double installment;

    {
        this.installment = 23890.90; // Initialized in non-static block
    }

    public LIC() {
        // this.installment = 23890.90; // Can also be initialized here
    }
}

public class BlankFinalField {
    public static void main(String[] args) {
        LIC lic = new LIC();
        System.out.println(lic.installment);
    }
}
