package Pertemuan1;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] plat = { "A", "B", "D", "E", "F", "G", "H", "L", "N", "T" };

        String[][] KOTA = {
                { "B", "A", "N", "T", "E", "N" },
                { "J", "A", "K", "A", "R", "T", "A" },
                { "B", "A", "N", "D", "U", "N", "G" },
                { "C", "I", "R", "E", "B", "O", "N" },
                { "B", "O", "G", "O", "R" },
                { "P", "E", "K", "A", "L", "O", "N", "G", "A", "N" },
                { "S", "E", "M", "A", "R", "A", "N", "G" },
                { "S", "U", "R", "A", "B", "A", "Y", "A" },
                { "M", "A", "L", "A", "N", "G" },
                { "T", "E", "G", "A", "L" }
        };

        for (int i = 0; i < plat.length; i++) {
            System.out.print(plat[i] + " ");
        }
        System.out.println();
        System.out.print("Masukkan Plat Kota: ");
        String platnomor = input.nextLine();

        int target = 0;
        for (int i = 0; i < plat.length; i++) {
            if (platnomor.equalsIgnoreCase(plat[i])) {
                target = i;
                break;
            }
        }

        for (int i = 0; i < KOTA[target].length; i++) {
            if (KOTA[target][i] != null) {
                System.out.print(KOTA[target][i]);
            }
        }

        input.close();
    }
}
