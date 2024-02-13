package Pertemuan1;

import java.util.Scanner;

public class prakFungsi {

    static String[] cabang = { "RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4" };
    static String[] bunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
    static double[] harga = { 75000, 50000, 60000, 10000 };
    static int[][] stokBunga = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };

    static int PendapatanCabang(int cabang) {
        int pendapatan = 0;
        int cab = cabang;
        cab -= 1;
        for (int i = 0; i < bunga.length; i++) {
            pendapatan += (harga[i] * stokBunga[cab][i]);
        }
        return pendapatan;
    }

    static void cekStokBungaCabang(int cabang) {
        int cab = cabang;
        cab -= 1;

        System.out.println("====================================================================================");
        if (cab == 3) {
            stokBunga[cab][0] -= 1;
            stokBunga[cab][1] -= 2;
            stokBunga[cab][2] -= 0;
            stokBunga[cab][3] -= 5;
            System.out.printf("%-15s %-15s %-15s  %-15s \n", "Algonema", "Keladi", "Alocasia",
                    "Mawar");

            System.out.printf("%-15d %-15d %-15d  %-15d \n", stokBunga[cab][0], stokBunga[cab][1],
                    stokBunga[cab][2], stokBunga[cab][3]);
            System.out.println(
                    "terdapat informasi tambahan berupa pengurangan stock karena bunga tersebut mati. Dengan rincian Aglonema -1, Keladi -2, Alocasia -0, Mawar -5.");
        } else {

            System.out.printf("%-15s %-15s %-15s  %-15s \n", "Algonema", "Keladi", "Alocasia",
                    "Mawar");

            System.out.printf("%-15d %-15d %-15d  %-15d \n", stokBunga[cab][0], stokBunga[cab][1],
                    stokBunga[cab][2], stokBunga[cab][3]);
        }
        System.out.println("====================================================================================");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fitur;
        do {
            System.out.println("====================");
            System.out.println("INI TOKO BUNGA");
            System.out.println("====================");
            System.out.println("1. Pendapatan Cabang");
            System.out.println("2. Cek Stok Bunga Cabang");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Angka: ");
            fitur = input.nextInt();

            switch (fitur) {
                case 1:
                    int cabang;
                    System.out.println("====================");
                    System.out.println("PENDAPATAN CABANG");
                    System.out.println("====================");
                    System.out.println("1. RoyalGarden 1");
                    System.out.println("2. RoyalGarden 2");
                    System.out.println("3. RoyalGarden 3");
                    System.out.println("4. RoyalGarden 4");
                    System.out.print("Masukkan Angka: ");
                    cabang = input.nextInt();
                    int pendapatan = PendapatanCabang(cabang);
                    System.out.println("===============================================");
                    System.out.println("Pendapatan Cabang RoyalGarden " + cabang + " : " + pendapatan);
                    System.out.println("===============================================");
                    break;

                case 2:
                    int cabangg;
                    System.out.println("====================");
                    System.out.println("CEK STOK CABANG");
                    System.out.println("====================");
                    System.out.println("1. RoyalGarden 1");
                    System.out.println("2. RoyalGarden 2");
                    System.out.println("3. RoyalGarden 3");
                    System.out.println("4. RoyalGarden 4");
                    System.out.print("Masukkan Angka: ");
                    cabangg = input.nextInt();
                    cekStokBungaCabang(cabangg);
                    break;
                default:
                    System.out.println("Masukkan Nomor Cabang");
                    break;
            }

        } while (fitur != 0);

        input.close();
    }
}
