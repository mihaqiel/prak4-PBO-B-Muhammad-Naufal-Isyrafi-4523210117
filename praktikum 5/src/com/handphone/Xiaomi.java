package com.handphone;

public class Xiaomi implements Handphone {

    private int volume = 50;

    @Override
    public void nyalakan() {
        System.out.println("XIAOMI Handphone menyala");
    }

    @Override
    public void matikan() {
        System.out.println("XIAOMI Handphone mati");
    }

    @Override
    public void besarkanSuara() {
        if (volume < MAX_VOLUME) {
            volume += 10;
        }

        System.out.println("Volume Xiaomi: " + volume);
    }

    @Override
    public void kecilkanSuara() {
        if (volume > MIN_VOLUME) {
            volume -= 10;
        }

        System.out.println("Volume Xiaomi: " + volume);
    }
}