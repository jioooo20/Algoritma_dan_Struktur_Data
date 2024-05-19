package Pertemuan12.tugas.tugas2;

import java.util.Scanner;

public class bioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ddlfilm film = new ddlfilm();
        System.out.println("\n");

        // film.addFirst(111, "a", 3.7);
        // film.addLast(222, "b", 9.2);
        // film.addLast(333, "c", 6.8);
        // film.add(777, "d", 2.4, 3);
        // film.print();

        int pilih = -1;
        while (pilih != 0) {
            System.out.println("=================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("=================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Raing Film - DESC");
            System.out.println("0. Keluar");
            System.out.println("=================================");
            System.out.print("Pilih Angka : ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("=================================");
                    System.out.println("Masukkan Data Film Posisi Awal : ");
                    System.out.print("ID Film : ");
                    int id1 = input.nextInt();
                    input.nextLine();
                    System.out.print("Judul Film : ");
                    String title1 = input.nextLine();
                    System.out.print("Rating Film : ");
                    Double rate1 = input.nextDouble();
                    input.nextLine();
                    film.addFirst(id1, title1, rate1);
                    break;
                case 2:
                    System.out.println("=================================");
                    System.out.println("Masukkan Data Film Posisi Akhir : ");
                    System.out.print("ID Film : ");
                    int id2 = input.nextInt();
                    input.nextLine();
                    System.out.print("Judul Film : ");
                    String title2 = input.nextLine();
                    System.out.print("Rating Film : ");
                    Double rate2 = input.nextDouble();
                    input.nextLine();
                    film.addLast(id2, title2, rate2);
                    break;
                case 3:
                    System.out.println("=================================");
                    System.out.println("Masukkan Data Film Posisi Tertentu : ");
                    System.out.print("ID Film : ");
                    int id3 = input.nextInt();
                    input.nextLine();
                    System.out.print("Judul Film : ");
                    String title3 = input.nextLine();
                    System.out.print("Rating Film : ");
                    Double rate3 = input.nextDouble();
                    input.nextLine();
                    System.out.print("Data Film akan dimasukkan di urutan ke - ");
                    int index = input.nextInt();
                    input.nextLine();
                    film.add(id3, title3, rate3, index - 1);
                    break;
                case 4:
                    film.removeFirst();
                    break;
                case 5:
                    film.removeLast();
                    break;
                case 6:
                    System.out.print("Hapus data posisi ke - ");
                    int indexx = input.nextInt();
                    input.nextLine();
                    film.remove(indexx - 1);
                    break;
                case 7:
                    film.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID Film yang dicari : ");
                    int id8 = input.nextInt();
                    input.nextLine();
                    film.cariID(id8);
                    break;
                case 9:
                    film.insertionSortDesc();
                    break;
                case 11:// hidden fitur buat debug doang
                    film.size();
                    break;
            }
        }

        input.close();
    }
}

// film.print();
// film.addFirst(111, "a", 3.7);
// film.addLast(222, "b", 9.2);
// film.addLast(333, "c", 6.8);
// film.add(777, "d", 2.4, 2);
// film.print();
// film.insertionSortDesc();
// film.print();

// film.cariID(232);

// film.removeLast();
// film.print();
// film.removeFirst();
// film.print();
// film.remove(0);
// film.print();
