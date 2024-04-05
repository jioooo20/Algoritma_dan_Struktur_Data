package Pertemuan7;

import java.util.Scanner;

public class BukuMain13 {
    public static void main(String[] args) {
        Scanner inputS = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);

        PencarianBuku13 data = new PencarianBuku13();
        int jumBuk = 5;

        System.out.println("===========================================");
        // System.out.println("Masukkan data buku secara urut dari kodeBuku terkecil :
        // ");
        // for (int i = 0; i < jumBuk; i++) {
        // System.out.println("===============");
        // System.out.print("Kode Buku : ");
        // String kodeBuku = inputS.nextLine();
        // System.out.print("Judul buku : ");
        // String judulBuku = inputS.nextLine();
        // System.out.print("Tahun terbit : ");
        // int tahunTrbt = inputInt.nextInt();
        // System.out.print("Pengarang : ");
        // String pengarang = inputS.nextLine();
        // System.out.print("Stok : ");
        // int stok = inputInt.nextInt();

        // Buku13 m = new Buku13(kodeBuku, judulBuku, tahunTrbt, pengarang, stok);
        // data.tambah(m);
        // }

        Buku13 m1 = new Buku13("1", "angkasa pura", 2002, "Aziz", 1);
        Buku13 m2 = new Buku13("2", "tetes air", 2023, "bagaskara", 2);
        Buku13 m3 = new Buku13("3", "cendana", 2014, "kifli", 3);
        Buku13 m4 = new Buku13("4", "tetes air", 2021, "citra dewi", 4);
        Buku13 m5 = new Buku13("5", "elang jawa", 2007, "tere ye", 5);

        data.tambah(m5);
        data.tambah(m4);
        data.tambah(m3);
        data.tambah(m1);
        data.tambah(m2);

        System.out.println("===============================================");
        System.out.println("Data keseluruhan Buku");
        System.out.println("===============================================");
        data.tampil();

        // System.out.println("===============================================");
        // System.out.println("===============================================");
        // System.out.println("Masukkan kode buku yang dicari ");
        // System.out.print("Kode Buku : ");
        // String cari = inputS.nextLine();
        // System.out.println("menggunakan binary search");
        // data.StrInsertionSortAsc();
        // int posisi = data.StrFindBinarySearch(cari, 0, jumBuk - 1);
        // data.printPosisi(cari, posisi);
        // data.printData(cari, posisi);
        // System.out.println("===============================================");
        // System.out.println("menggunakan sequential search ");

        // int posisii = data.findseqSearch(cari);
        // data.printPosisi(cari, posisii);
        // data.printData(cari, posisii);

        System.out.println("1. kode buku");
        System.out.println("2. nama buku");
        System.out.println("Pencarian Data berdasarkan : ");
        int hmzzz = inputInt.nextInt();

        switch (hmzzz) {
            case 1:
                System.out.println("===============================================");
                System.out.println("===============================================");
                System.out.println("Masukkan kode buku yang dicari ");
                System.out.print("Kode Buku : ");
                String cari = inputS.nextLine();
                System.out.println("menggunakan binary search");
                data.StrInsertionSortAsc();
                int posisi = data.StrFindBinarySearch(cari, 0, jumBuk - 1);
                data.printPosisi(cari, posisi);
                data.printData(cari, posisi);
                System.out.println("===============================================");
                System.out.println("menggunakan sequential search ");

                int posisii = data.findseqSearch(cari);
                data.printPosisi(cari, posisii);
                data.printData(cari, posisii);

                break;
            case 2:
                System.out.println("===============================================");
                System.out.println("===============================================");
                System.out.println("Masukkan nama buku yang dicari: ");
                System.out.print("nama Buku : ");
                String carii = inputS.nextLine();

                int dbl = data.judulDobel(carii);
                if (dbl > 1) {
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Buku dengan judul " + carii + " memiiliki lebih dari 1 ");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
                } else {
                    System.out.println("menggunakna sequential search");
                    Buku13 dabuk = data.findbuku(carii);
                    dabuk.printBuku();

                    System.out.println("===============================================");
                    System.out.println("menggunakan Binary search ");
                    data.StrInsertionSortJudulAsc(); // Urutkan data berdasarkan judul buku
                    int posisiii = data.StrFindBukuBinary(carii, 0, jumBuk - 1);
                    // System.out.println(posisiii);
                    data.printPosisi(carii, posisiii);
                    data.printData(carii, posisiii);
                }

                break;

            default:
                System.out.println("Pilih 1 atau 2");
                break;
        }

        inputInt.close();
        inputS.close();
    }
}
