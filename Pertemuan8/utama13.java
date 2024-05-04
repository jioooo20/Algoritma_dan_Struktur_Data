package Pertemuan8;

import java.util.Scanner;

public class utama13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kapasitas Gudang : ");
        int cap = scanner.nextInt();
        scanner.nextLine();
        Gudang13 gudang = new Gudang13(cap);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Cari (kode)");
            System.out.println("7. Cari (nama)");
            System.out.println("0. keluar");
            System.out.print("Pilih Operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang13 barangBaru = new Barang13(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    gudang.konversiDesimalkeBiner(kode);
                    break;
                case 2:
                    gudang.ambiBarang13();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("Masukkan kode : ");
                    int kodd = scanner.nextInt();
                    scanner.nextLine();
                    gudang.cariKode(kodd);
                    break;
                case 7:
                System.out.print("Masukkan nama : ");
                    String namm = scanner.nextLine();
                    gudang.cariNama(namm);
                    break;
                default:
                    System.out.println("Pilih angka 1 - 5");
                    break;
            }
        }
    }
}
