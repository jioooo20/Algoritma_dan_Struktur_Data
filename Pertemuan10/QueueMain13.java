package Pertemuan10;

import java.util.Scanner;

class QueueMain13 { 
    public static void menu() {
        System.out.println("\nPilih Menu");
        System.out.println("1. Antrean baru");
        System.out.println("2. Antrean keluar");
        System.out.println("3. Cek antrean terdepan");
        System.out.println("4. Cek semua antrean");
        System.out.println("5. Cek antrean belakang");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kapasitas Queue: ");
        int jum = input.nextInt();
        Nasabah_queue13 antri = new Nasabah_queue13(jum);
        int pilih;

        do {
            menu();
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan No Rekening: ");
                    String norek = input.nextLine();
                    input.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Alamat: ");
                    String alamat = input.nextLine();
                    System.out.print("Masukkan Umur: ");
                    int umur = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Saldo: ");
                    double saldo = input.nextDouble();
                    input.nextLine();
                    Nasabah13 nb = new Nasabah13(norek, nama, alamat, umur, saldo);
                    antri.enQueue(nb);
                    break;

                case 2:
                    Nasabah13 data = antri.deQueue();
                    // if (!"".equals(data.norek) && !"".equals(data.nama) &&
                    // !"".equals(data.alamat) && data.umur != 0
                    // && data.saldo != 0) {
                    // System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + "
                    // " + data.alamat
                    // + " " + data.umur + " " + data.saldo);
                    // }

                    if (data.norek != null && data.nama != null && data.alamat != null && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                    }

                    // if (data.umur != 0) {
                    // System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + "
                    // " + data.alamat
                    // + " " + data.umur + " " + data.saldo);
                    // }

                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;

            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);

        input.close();
    }
}
