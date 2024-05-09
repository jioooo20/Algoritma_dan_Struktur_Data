package Pertemuan10.tugas;

import java.util.Scanner;

public class pembeliMain13 {
    public static void menu() {
        System.out.println("\nPilih Menu");
        System.out.println("1. Pembeli baru");
        System.out.println("2. Pembeli keluar");
        System.out.println("3. Cek pembeli terdepan");
        System.out.println("4. Cek pembeli paling belakang");
        System.out.println("5. Cari informasi pembeli (nama)");
        System.out.println("6. Tampilkan semua informasi pembeli");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputin = new Scanner(System.in);
        System.out.print("\n\nMasukkan jumlah pembeli maksimal : ");
        int jupem = inputin.nextInt();
        queue antriBoz = new queue(jupem);
        int chuz;
        do {
            menu();
            chuz = inputin.nextInt();
            switch (chuz) {
                case 1:
                    System.out.print("Masukkan nama pembeli: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan no HP pembeli: ");
                    int noHape = inputin.nextInt();
                    pembeli13 baru = new pembeli13(nama, noHape);
                    antriBoz.enqueue(baru);
                    break;

                case 2:
                    pembeli13 data = antriBoz.dequeue();
                    if (data.nama != null) {
                        System.out.println("Antrian yang keluar: \nNama : " + data.nama + "\nno HP : " + data.noHp);
                    }
                    break;
                case 3:
                    antriBoz.peek();
                    break;
                case 4:
                    antriBoz.peekRear();
                    break;
                case 5:
                    System.out.print("Masukkan nama pembeli : ");
                    String n = input.nextLine();
                    antriBoz.peekPosisi(n);
                    // pembeli13 haya = antriBoz.peekPosisi(n);

                    // System.out.println(haya.nama);

                    break;
                case 6:
                    antriBoz.daftarPembeli();
                    break;
            }
        } while (chuz != 0);

        input.close();
    }
}
