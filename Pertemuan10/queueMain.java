package Pertemuan10;

import java.util.Scanner;

public class queueMain {
    public static void menu() {
        System.out.println("\nMasukkan operasi yang diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nMasukkan kapasitas Queue : ");
        int n = input.nextInt();
        int pilih;

        queue13 Q = new queue13(n);

        do {
            menu();
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = input.nextInt();
                    Q.enQueue(dataMasuk);
                    break;

                case 2:
                    int dataKeluar = Q.deQueue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;

            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);

        input.close();
    }
}