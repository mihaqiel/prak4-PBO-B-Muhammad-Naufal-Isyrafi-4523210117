// Samsung.java
package com.handphone;

public class Samsung implements Handphone {

    private int volume = 50;

    @Override
    public void nyalakan() {
        System.out.println("SAMSUNG Handphone menyala");
    }

    @Override
    public void matikan() {
        System.out.println("SAMSUNG Handphone mati");
    }

    @Override
    public void besarkanSuara() {
        if (volume < MAX_VOLUME) {
            volume += 10;
        }

        System.out.println("Volume Samsung: " + volume);
    }

    @Override
    public void kecilkanSuara() {
        if (volume > MIN_VOLUME) {
            volume -= 10;
        }

        System.out.println("Volume Samsung: " + volume);
    }
}