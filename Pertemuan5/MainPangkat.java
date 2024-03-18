package Pertemuan5;

import java.util.Scanner;

public class MainPangkat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("Masukkan jumlah elemen : ");
        int elemen = input.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.println("Masukkan nilai yang dipangkatkan: ");
            int anilai = input.nextInt();
            png[i].nilai = anilai;
            input.nextLine();
            System.out.println("Masukkan nilai pangkat: ");
            int apangkat = input.nextInt();
            png[i].pangkat = apangkat;
            input.nextLine();
        }

        System.out.println("Pilih \n 1. Brute Force \n 2. Divide Conquer");
        int pilih = input.nextInt();
        input.nextLine();

        switch (pilih) {
            case value:

                break;

            default:
                break;
        }

        System.out.println("Hasil pangkat BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " +
                    png[i].nilai + " pangkat " +
                    png[i].pangkat + " adalah " +
                    png[i].PangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println("Hasil pangkat Divide Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " +
                    png[i].nilai + " pangkat " +
                    png[i].pangkat + " adalah " +
                    png[i].PangkatDC(png[i].nilai, png[i].pangkat));
        }

        input.close();
    }
}
