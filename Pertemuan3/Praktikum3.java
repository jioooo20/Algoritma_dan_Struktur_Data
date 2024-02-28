package Pertemuan3;

import java.util.Scanner;

class Mahasiswa {
    public String nama;
    public int nim;
    public String kelamin;
    public double ipk;

    public void avgIPK(Mahasiswa[] mhs) {
        double tot = 0;
        for (int i = 0; i < mhs.length; i++) {
            tot += mhs[i].ipk;
        }
        double rata = tot / mhs.length;
        System.out.println("Rata-rata IPK : " + rata);
    }

    public void bigestIPK(Mahasiswa[] mhs) {
        double a = mhs[0].ipk;// a = target tertinggi
        int index = -1;// index target tertinggi
        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i].ipk > a) {
                a = mhs[i].ipk;
                index = i;
            }
        }
        System.out.println("Mahasiswa dengan IPK tertinggi: " + mhs[index].nama);
        System.out.println("Nim : " + mhs[index].nim);
        System.out.println("IPK : " + mhs[index].ipk);
        System.out.println("Jenis kelamin : " + mhs[index].kelamin);
    }

}

public class Praktikum3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        Scanner inputDouble = new Scanner(System.in);

        Mahasiswa[] mhs = new Mahasiswa[3];
        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa();
            System.out.println("Masukkan Data Mahasiswa ke - " + (i + 1));
            System.out.print("Masukkan Nama : ");
            mhs[i].nama = input.nextLine();
            System.out.print("Masukkan NIM : ");
            mhs[i].nim = inputInt.nextInt();
            System.out.print("Masukkan Jenis Kelamin : ");
            mhs[i].kelamin = input.nextLine();
            System.out.print("Masukkan IPK : ");
            mhs[i].ipk = inputDouble.nextDouble();
        }

        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Data Mahasiswa ke - " + (i + 1));
            System.out.println("Nama : " + mhs[i].nama + "\nNIM : " + mhs[i].nim +
                    "\nJenis Kelamin : " + mhs[i].kelamin
                    + "\nNilai IPK : " + mhs[i].ipk);
        }

        mhs[0].avgIPK(mhs);
        mhs[0].bigestIPK(mhs);

        input.close();
        inputInt.close();
        inputDouble.close();
    }
}
