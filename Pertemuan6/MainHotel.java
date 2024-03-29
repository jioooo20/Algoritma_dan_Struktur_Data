package Pertemuan6;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Padma Resort Ubud      ", "Ubud", 3100000, (byte) 4);
        Hotel h2 = new Hotel("Kayon Jungle Resort    ", "Tanah Lot", 4500000, (byte) 5);
        Hotel h3 = new Hotel("Seminyak Beach Resort  ", "Seminyak", 3800000, (byte) 4);
        Hotel h4 = new Hotel("Melia Bali             ", "Uluwatu", 2400000, (byte) 3);
        Hotel h5 = new Hotel("Nusa Dua Beach         ", "Nusa Dua", 900000, (byte) 1);
        Hotel h6 = new Hotel("Montigo Resort Seminyak", "Seminyak", 1900000, (byte) 2);
        Hotel h7 = new Hotel("Oberoi Beach Resort    ", "Kuta", 6900000, (byte) 5);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);
        list.tambah(h6);
        list.tambah(h7);

        System.out.println("=====================");
        System.out.println("BALI HOTEL ISLAND");
        System.out.println("=====================");
        list.tampilAll();
        System.out.println("Sorting berdasarkan");
        System.out.println("1. Harga (Lowest to Highest)");
        System.out.println("2. Rating (5 => 1)");
        int pilih = input.nextInt();
        input.nextLine();

        switch (pilih) {
            case 1:
                System.out.println("Harga Terendah ke Tertinggi");
                list.selecsort();
                list.tampilAll();

                break;
            case 2:
                System.out.println("Rating Tertinggi ke Terendag");
                list.bubblesort();
                list.tampilAll();

                break;

            default:
                System.out.println("Pilih 1 / 2 !!");
                break;
        }

        input.close();
    }
}
