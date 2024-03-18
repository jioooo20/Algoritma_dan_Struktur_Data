package Pertemuan5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=========================================================");
        System.out.println("Program menghitung keuntungan total(satuan JUTA. Misal 5.9)");
        System.out.println("Masukkan jumlah perusahaan: ");
        int company = input.nextInt();
        input.nextLine();

        Sum[] cmp = new Sum[company];

        for (int i = 0; i < company; i++) {
            System.out.println("=========================================================");
            System.out.println("Masukkan jumlah bulan perusahaan " + (i + 1) + " : ");
            int bln = input.nextInt();
            input.nextLine();
            cmp[i] = new Sum(bln, company);
            cmp[i].perusahaan = bln;
            System.out.println("=========================================================");
            for (int j = 0; j < bln; j++) {
                System.out.println("Masukkan untung bulan ke " + (j + 1));
                cmp[i].keuntungan[j] = input.nextDouble();
                input.nextLine();
            }
        }

        System.out.println("=========================================================");
        System.out.println("SUM PERUSAHAAN BRUTE FORCE");
        for (int i = 0; i < company; i++) {
            System.out.println("Total keuntungan perusahaan " + (i + 1) + " selama " + cmp[i].elemen + " bulan adalah "
                    + cmp[i].totalBF(cmp[i].keuntungan));
        }
        System.out.println("=========================================================");
        System.out.println("SUM PERUSAHAAN DIVIDE CONQUER");
        for (int i = 0; i < company; i++) {
            System.out.println("Total keuntungan perusahaan " + (i + 1) + " selama " + cmp[i].elemen + " bulan adalah "
                    + cmp[i].totalDC(cmp[i].keuntungan, 0, cmp[i].elemen - 1));
        }

        input.close();
    }
}
