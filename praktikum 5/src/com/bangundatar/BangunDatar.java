package com.bangundatar;
public abstract class BangunDatar {


    protected String warna;

    public BangunDatar(String warna) {
        this.warna = warna;
    }

    public abstract double luas();

    public void info() {
        System.out.println("Warna: " + warna);
    }
}