package uts;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        proses data = new proses();
        int jum = 17;

        uts a0 = new uts(48);
        uts a1 = new uts(49);
        uts a2 = new uts(42);
        uts a3 = new uts(43);
        uts a4 = new uts(22);
        uts a5 = new uts(25);
        uts a6 = new uts(21);
        uts a7 = new uts(39);
        uts a8 = new uts(50);
        uts a9 = new uts(38);
        uts a10 = new uts(29);
        uts a11 = new uts(28);
        uts a12 = new uts(30);
        uts a13 = new uts(25);
        uts a14 = new uts(5);
        uts a15 = new uts(7);
        uts a16 = new uts(12);

        data.tambah(a0);
        data.tambah(a1);
        data.tambah(a2);
        data.tambah(a3);
        data.tambah(a4);
        data.tambah(a5);
        data.tambah(a6);
        data.tambah(a7);
        data.tambah(a8);
        data.tambah(a9);
        data.tambah(a10);
        data.tambah(a11);
        data.tambah(a12);
        data.tambah(a13);
        data.tambah(a14);
        data.tambah(a15);
        data.tambah(a16);

        System.out.println();
        System.out.println("=============");
        System.out.println("Data Awal");
        System.out.println("=============");

        data.PrintAwalSemua();
        
        System.out.println();
        System.out.println("=============");
        System.out.println("Data setelah sorting insertion ascending");
        System.out.println("=============");

        data.insertionSortAsc();
        data.PrintAwalSemua();
        System.out.println();
        System.out.println("=============");

        
        System.out.print("Masukkan angka yang ingin dicari : ");
        int cari = input.nextInt();

        int posisi = data.FindBinarySearch(cari, 0, jum - 1);

        data.PrintHasil(posisi,cari);

    }
}
