package com.handphone;

public class Vivo implements Handphone {

    private int volume = 50;

    @Override
    public void nyalakan() {
        System.out.println("VIVO Handphone menyala");
    }

    @Override
    public void matikan() {
        System.out.println("VIVO Handphone mati");
    }

    @Override
    public void besarkanSuara() {
        if (volume < MAX_VOLUME) {
            volume += 10;
        }

        System.out.println("Volume Vivo: " + volume);
    }

    @Override
    public void kecilkanSuara() {
        if (volume > MIN_VOLUME) {
            volume -= 10;
        }

        System.out.println("Volume Vivo: " + volume);
    }
}