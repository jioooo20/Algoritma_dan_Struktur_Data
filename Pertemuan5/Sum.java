package Pertemuan5;

import java.util.Scanner;

public class Sum {
    int elemen;
    double keuntungan[], total;

    Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total += arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = l + (r - l) / 2;
            double lsum = totalDC(arr, l, mid);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=========================================================");
        System.out.println("Program menghitung keuntungan total(satuan JUTA. Misal 5.9)");
        System.out.println("Masukkan jumlah bulan: ");
        int elem = input.nextInt();
        input.nextLine();

        Sum sm = new Sum(elem);
        System.out.println("=========================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.println("Masukkan untung bulan ke " + (i + 1));
            sm.keuntungan[i] = input.nextDouble();
            input.nextLine();
        }

        System.out.println("=========================================================");
        System.out.println("SUM BRUTE FORCE");
        System.out.println("Total keuntungan selama " + sm.elemen + " bulan adalah " + sm.totalBF(sm.keuntungan));
        System.out.println("=========================================================");
        System.out.println("SUM DIVIDE CONQUER");
        System.out.println("Total keuntungan selama " + sm.elemen + " bulan adalah "
                + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));

        input.close();
    }

}
