package Pertemuan7;

import java.util.Scanner;

public class BukuMain13 {
    public static void main(String[] args) {
        Scanner inputS = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);

        PencarianBuku13 data = new PencarianBuku13();
        int jumBuk = 5;

        System.out.println("===========================================");
        System.out.println("Masukkan data buku secara urut dari kodeBuku terkecil : ");
        for (int i = 0; i < jumBuk; i++) {
            System.out.println("===============");
            System.out.print("Kode Buku : ");
            int kodeBuku = inputInt.nextInt();
            System.out.print("Judul buku : ");
            String judulBuku = inputS.nextLine();
            System.out.print("Tahun terbit : ");
            int tahunTrbt = inputInt.nextInt();
            System.out.print("Pengarang : ");
            String pengarang = inputS.nextLine();
            System.out.print("Stok : ");
            int stok = inputInt.nextInt();

            Buku13 m = new Buku13(kodeBuku, judulBuku, tahunTrbt, pengarang, stok);
            data.tambah(m);
        }
        System.out.println("===============================================");
        System.out.println("Data keseluruhan Buku");
        System.out.println("===============================================");
        data.tampil();

        System.out.println("===============================================");
        System.out.println("===============================================");
        System.out.println("Masukkan kode buku yang dicari ");
        System.out.print("Kode Buku : ");
        int cari = inputInt.nextInt();
        System.out.println("menggunakan binary search");
        data.insertionSortAsc();
        int posisi = data.FindBinarySearch(cari, 0, jumBuk - 1);
        data.printPosisi(cari, posisi);
        data.printData(cari, posisi);
        System.out.println("===============================================");
        System.out.println("menggunakan sequential search ");

        int posisii = data.findseqSearch(cari);
        data.printPosisi(cari, posisii);
        data.printData(cari, posisii);

        // System.out.println("1. kode buku");
        // System.out.println("2. nama buku");
        // System.out.println("Pencarian Data berdasarkan : ");
        // int hmzzz = inputInt.nextInt();

        // switch (hmzzz) {
        // case 1:
        // System.out.println("Masukkan kode buku yang dicari: ");
        // System.out.print("Kode Buku : ");
        // int cari = inputInt.nextInt();
        // System.out.println("menggunakna sequential search");
        // int posisi = data.findseqSearch(cari);
        // data.printPosisi(cari, posisi);
        // data.printData(cari, posisi);

        // break;
        // case 2:
        // System.out.println("Masukkan nama buku yang dicari: ");
        // System.out.print("nama Buku : ");
        // String carii = inputS.nextLine();
        // System.out.println("menggunakna sequential search");
        // Buku13 dabuk = data.findbuku(carii);
        // dabuk.printBuku();

        // break;

        // default:
        // System.out.println("Pilih 1 atau 2");
        // break;
        // }

        inputInt.close();
        inputS.close();
    }
}
