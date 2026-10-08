package com.bangundatar;
public class Lingkaran extends BangunDatar {

    private int jari2;

    public Lingkaran(String warna, int jari2) {
        super(warna);
        this.jari2 = jari2;
    }

    @Override
    public double luas() {
        return Math.PI * jari2 * jari2;
    }

    public void tampilkan() {
        System.out.println("=== Lingkaran ===");
        info();
        System.out.println("Jari-jari: " + jari2);
        System.out.println("Luas: " + luas());
    }
}