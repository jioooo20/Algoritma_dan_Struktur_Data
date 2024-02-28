package Pertemuan3;

import java.util.Scanner;

class PersegiPanjang13 {
    public int panjang;
    public int lebar;

}

class Persegi13 {
    public int sisi;

}

public class ArrayObjects13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak Persegi Panjang: ");
        int BnykPP = input.nextInt();

        PersegiPanjang13[] ppArray = new PersegiPanjang13[BnykPP];

        for (int i = 0; i < BnykPP; i++) {
            ppArray[i] = new PersegiPanjang13();
            System.out.println("Persegi Panjang ke -" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = input.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = input.nextInt();
        }

        for (int i = 0; i < BnykPP; i++) {
            System.out.println("Persegi Panjang ke -" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }

        Persegi13[] pgArray = new Persegi13[100];
        pgArray[5] = new Persegi13();
        pgArray[5].sisi = 20;

        input.close();
    }
}

// PersegiPanjang13[] ppArray = new PersegiPanjang13[3];

// ppArray[0] = new PersegiPanjang13();
// ppArray[0].panjang = 110;
// ppArray[0].lebar = 30;

// ppArray[1] = new PersegiPanjang13();
// ppArray[1].panjang = 80;
// ppArray[1].lebar = 40;

// ppArray[2] = new PersegiPanjang13();
// ppArray[2].panjang = 100;
// ppArray[2].lebar = 20;

// System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang +
// ", lebar: " + ppArray[0].lebar);
// System.out.println("Persegi Panjang ke-1, panjang: " + ppArray[1].panjang +
// ", lebar: " + ppArray[1].lebar);
// System.out.println("Persegi Panjang ke-2, panjang: " + ppArray[2].panjang +
// ", lebar: " + ppArray[2].lebar);
