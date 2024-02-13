package Pertemuan1;

import java.util.Scanner;

public class prakArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] matkul = { "Pancasila", "KTI", "CTPS", "MatDas", "BIG", "DasPro", "Prak DasPro", "K3" };
        double[] nilai = new double[8];
        int[] bobotSKS = { 2, 2, 2, 3, 2, 2, 3, 2 };
        double sigmaI = 0;
        int jumSKS = 18;

        System.out.println("==========================");
        System.out.println("Menghitung IP SEMSETER");
        System.out.println("==========================");

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan Nilai " + matkul[i] + " : ");
            nilai[i] = input.nextDouble();
        }

        int[] nilaiHuruf = new int[nilai.length];

        for (int i = 0; i < nilai.length; i++) {
            nilaiHuruf[i] = (int) nilai[i];
        }

        String[] NilHuruf = new String[nilaiHuruf.length];
        double[] bobot = new double[nilaiHuruf.length];
        for (int i = 0; i < nilaiHuruf.length; i++) {
            if (nilaiHuruf[i] > 80 && nilaiHuruf[i] <= 100) {
                NilHuruf[i] = "A";
                bobot[i] = 4;
            } else if (nilaiHuruf[i] > 73 && nilaiHuruf[i] <= 80) {
                NilHuruf[i] = "B+";
                bobot[i] = 3.5;
            } else if (nilaiHuruf[i] > 65 && nilaiHuruf[i] <= 73) {
                NilHuruf[i] = "B";
                bobot[i] = 3;
            } else if (nilaiHuruf[i] > 60 && nilaiHuruf[i] <= 65) {
                NilHuruf[i] = "C+";
                bobot[i] = 2.5;
            } else if (nilaiHuruf[i] > 50 && nilaiHuruf[i] <= 60) {
                NilHuruf[i] = "C";
                bobot[i] = 2;
            } else if (nilaiHuruf[i] > 39 && nilaiHuruf[i] <= 50) {
                NilHuruf[i] = "D";
                bobot[i] = 1;
            } else if (nilaiHuruf[i] <= 39) {
                NilHuruf[i] = "E";
                bobot[i] = 0;
            }
        }

        for (int i = 0; i < bobot.length; i++) {
            sigmaI += bobot[i] * bobotSKS[i];
        }

        double ipSemester = sigmaI / jumSKS;

        System.out.println("==========================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==========================");

        for (int i = 0; i < matkul.length; i++) {
            if (matkul[i] != null) {
                System.out.printf("%-15s %-10.1f %-10s  %-10.1f \n", matkul[i], nilai[i], NilHuruf[i], bobot[i]);
            }
        }
        System.out.println("======================");
        System.out.print("IP : " + ipSemester);

        input.close();
    }
}
