package Pertemuan8;

import java.util.Scanner;

public class PostfixMain13{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String p,q;
        System.out.print("\nMasukkan ekspresi matematika (infix) : ");
        q = input.nextLine();
        q = q.trim();
        q = q+ ")";

        int total = q.length();
        Postfix13 post = new Postfix13(total);
        p = post.konversi(q);
        System.out.println("Postfix : " + p);

        input.close();
    }
}
