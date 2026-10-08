package com.hewan;

public class Bebek implements Terbang, Berenang {

    @Override
    public void terbang() {
        System.out.println("Bebek terbang");
    }

    @Override
    public void berenang() {
        System.out.println("Bebek berenang");
    }
}