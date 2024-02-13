package Pertemuan1;

import java.util.Scanner;

public class prakPerulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long nim;

        System.out.print("Masukkan NIM: ");
        nim = input.nextLong();
        System.out.println("========================");
        long duadigit = nim;
        int digit = (int) (duadigit % 100);

        if (digit < 10) {
            digit += 10;
        }
        System.out.println("n = " + digit);

        for (int i = 1; i <= digit; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else {
                if (i % 2 == 0) {
                    System.out.print(i);
                } else {
                    System.out.print(" * ");
                }
            }

        }

        input.close();
    }
}
