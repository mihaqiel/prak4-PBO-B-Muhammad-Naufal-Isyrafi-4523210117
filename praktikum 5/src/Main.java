import com.bangundatar.Lingkaran;
import com.bangundatar.Segitiga;

import com.hewan.Bebek;

import com.handphone.Handphone;
import com.handphone.Samsung;
import com.handphone.Vivo;
import com.handphone.Xiaomi;

public class Main {

    public static void main(String[] args) {

        // =========================
        // ABSTRACT CLASS
        // =========================

        System.out.println("===== ABSTRACT CLASS =====");

        Lingkaran lingkaran = new Lingkaran("Merah", 7);
        System.out.println("Luas Lingkaran: " + lingkaran.luas());

        Segitiga segitiga = new Segitiga("Biru", 10, 5);
        System.out.println("Luas Segitiga: " + segitiga.luas());

        // =========================
        // INTERFACE HEWAN
        // =========================

        System.out.println("\n===== INTERFACE HEWAN =====");

        Bebek bebek = new Bebek();

        bebek.terbang();
        bebek.berenang();

        // =========================
        // INTERFACE HANDPHONE
        // =========================

        System.out.println("\n===== INTERFACE HANDPHONE =====");

        Handphone samsung = new Samsung();
        Handphone vivo = new Vivo();
        Handphone xiaomi = new Xiaomi();

        System.out.println("\n--- Samsung ---");
        samsung.nyalakan();
        samsung.besarkanSuara();
        samsung.kecilkanSuara();
        samsung.matikan();

        System.out.println("\n--- Vivo ---");
        vivo.nyalakan();
        vivo.besarkanSuara();
        vivo.kecilkanSuara();
        vivo.matikan();

        System.out.println("\n--- Xiaomi ---");
        xiaomi.nyalakan();
        xiaomi.besarkanSuara();
        xiaomi.kecilkanSuara();
        xiaomi.matikan();
    }
}