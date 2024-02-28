package Pertemuan3;

// class Balok {
//     public int panjang;
//     public int lebar;
//     public int tinggi;

//     public Balok(int p, int l, int t) {
//         panjang = p;
//         lebar = l;
//         tinggi = t;
//     }

//     public int hitungVolume() {
//         return panjang * lebar * tinggi;
//     }

// }

class Segitiga {
    public int alas;
    public int tinggi;
    public int sisi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public double hitungLuas() {
        double luas = (double) 0.5 * (alas * tinggi);
        return luas;
    }

    public double hitungKeliling() {
        double miring = Math.sqrt(alas * alas + tinggi * tinggi);
        return 2 * miring + alas;
    }
}

public class ArrayBalok13 {

    public static void main(String[] args) {
        // Balok[] blArray = new Balok[3];
        // blArray[0] = new Balok(100, 30, 12);
        // blArray[1] = new Balok(120, 40, 15);
        // blArray[2] = new Balok(210, 50, 25);

        // for (int i = 0; i < 3; i++) {
        // System.out.println("Volume balok ke " + i + " : " +
        // blArray[i].hitungVolume());
        // }

        Segitiga[] sgArray = new Segitiga[4];
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Segitiga ke - " + (i + 1));
            System.out.println("Luas: " + sgArray[i].hitungLuas());
            System.out.println("Keliling : " + sgArray[i].hitungKeliling());
        }

    }

}
