package Pertemuan5;

import java.util.Scanner;

public class Showroom {

    public String merk, tipe;
    public int tahun, top_acc, top_pow;

    public Showroom(String merk, String tipe, int tahun, int top_acc, int top_pow) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acc = top_acc;
        this.top_pow = top_pow;
    }

    public int TopAcc() {
        return top_acc;
    }

    public int TopPow() {
        return top_pow;
    }

    public static int HighestAcc(Showroom[] showrooms, int l, int r) {
        if (l == r) {
            return l;
        }
        int mid = l + (r - l) / 2;

        int mr = HighestAcc(showrooms, mid + 1, r);
        int ml = mid;

        if (showrooms[mr].TopAcc() > showrooms[ml].TopAcc()) {
            ml = mr;
        }

        mr = HighestAcc(showrooms, l, mid);

        if (showrooms[mr].TopAcc() > showrooms[ml].TopAcc()) {
            ml = mr;
        }
        return ml;
    }

    public static int LowestAcc(Showroom[] showrooms, int l, int r) {
        if (l == r) {
            return l;
        }

        int mid = l + (r - l) / 2;

        int mr = LowestAcc(showrooms, mid + 1, r);
        int ml = mid;

        if (showrooms[mr].TopAcc() < showrooms[ml].TopAcc()) {
            ml = mr;
        }
        mr = LowestAcc(showrooms, l, mid);

        if (showrooms[mr].TopAcc() < showrooms[ml].TopAcc()) {
            ml = mr;
        }

        return ml;
    }

    public static double AvgPower(Showroom[] showrooms) {
        double totPow = 0;
        int totMobil = 0;
        for (Showroom showroom : showrooms) {
            totPow += showroom.TopPow();
            totMobil++;
        }
        return totPow / totMobil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.println("Masukkan jumlah mobil");
        // int jml = input.nextInt();
        // input.nextLine();
        Showroom[] mobil = new Showroom[8];

        mobil[0] = new Showroom("BMW", "M2 Coupe", 2016, 6816, 728);
        mobil[1] = new Showroom("Ford", "Fiesta ST", 2014, 3921, 575);
        mobil[2] = new Showroom("Nissan", "370Z", 2009, 4360, 657);
        mobil[3] = new Showroom("Subaru", "BRZ", 2014, 4058, 609);
        mobil[4] = new Showroom("Subaru", "MImpreza WRX STI", 2013, 6255, 703);
        mobil[5] = new Showroom("Toyota", "MAE86 Trueno", 1986, 3700, 553);
        mobil[6] = new Showroom("Toyota", "86/GT86", 2014, 4180, 609);
        mobil[7] = new Showroom("Volkswagen", "Golf GTI", 2014, 4180, 631);

        int highIndex = Showroom.HighestAcc(mobil, 0, mobil.length - 1);
        int lowIndex = Showroom.LowestAcc(mobil, 0, mobil.length - 1);
        double avg = Showroom.AvgPower(mobil);

        System.out.println(
                "Mobil dengan akselerasi tertinggi : " + mobil[highIndex].merk + " : " + mobil[highIndex].tipe + " : "
                        + mobil[highIndex].top_acc);
        System.out.println("Mobil dengan akselerasi terndah : " + mobil[lowIndex].merk + " : " + mobil[lowIndex].tipe
                + " : " + mobil[lowIndex].top_acc);
        System.out.println("Rata2 power semua mobil adalah " + avg);

        input.close();
    }

}

// vvvvv MASUKKAN DATA MENGGUNAKAN SCANNER vvvvv
// ===============================================
// System.out.println("Masukkan Merk mobil");
// String merekk = input.nextLine();
// System.out.println("Masukkan Tipe mobil");
// String tipee = input.nextLine();
// System.out.println("Masukkan Tahun mobil");
// int tahunn = input.nextInt();
// input.nextLine();
// System.out.println("Masukkan Top Akselerasi mobil");
// int acc = input.nextInt();
// input.nextLine();
// System.out.println("Masukkan Top Power mobil");
// int pow = input.nextInt();
// input.nextLine();
// mobil[i] = new Showroom(merekk, tipee, tahunn, acc, pow);