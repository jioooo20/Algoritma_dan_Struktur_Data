package Pertemuan5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("================");
        System.out.println("Masukkan jumlah elemen");
        int iJml = input.nextInt();

        Faktorial[] fk = new Faktorial[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke " + (i + 1) + " : ");
            int iNilai = input.nextInt();
            fk[i].nilai = iNilai;
            input.nextLine();
        }

        System.out.println("Hasil Brute Force");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil penghitungan brute force : " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("Hasil Divide n Conquer");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil penghitungan divide conquer : " + fk[i].faktorialDC(fk[i].nilai));
        }

        input.close();
    }
}
