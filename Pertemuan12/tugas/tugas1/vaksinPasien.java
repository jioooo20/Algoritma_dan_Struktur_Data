package Pertemuan12.tugas.tugas1;

import java.util.Scanner;

public class vaksinPasien {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        qddlPasien pas = new qddlPasien();
        System.out.println("\n");

        int pilih = -1;

        while (pilih != 4) {
            menu();
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nomor Antrian: ");
                    int no = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Nama Pasien: ");
                    String nama = input.nextLine();

                    pas.tambahAntrian(no, nama);
                    break;

                case 2:
                    pas.hapusAntrian();
                    break;
                case 3:
                    pas.print();
                    System.out.println("Sisa Antrian : " + pas.size());
                    break;
            }
        }

        input.close();
    }

    static void menu() {
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("Pengantri Vaksin Valentino");
        System.out.println("+++++++++++++++++++++++++\n");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Penerima Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. keluar");
        System.out.println("+++++++++++++++++++++++++");
    }
}
