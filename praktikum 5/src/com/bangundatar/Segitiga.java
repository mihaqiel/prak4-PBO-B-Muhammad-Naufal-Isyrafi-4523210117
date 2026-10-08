package com.bangundatar;
public class Segitiga extends BangunDatar {

    private int alas;
    private int tinggi;

    public Segitiga(String warna, int alas, int tinggi) {
        super(warna);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    public void tampilkan() {
        System.out.println("=== Segitiga ===");
        info();
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Luas: " + luas());
    }
}