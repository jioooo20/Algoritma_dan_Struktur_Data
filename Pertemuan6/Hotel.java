package Pertemuan6;

public class Hotel {
    public String nama, kota;
    public int harga;
    public byte bintang;

    Hotel(String n, String k, int h, byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void spill() {
        System.out.println("Hotel       : " + nama);
        System.out.println("Lokasi      : " + kota);
        System.out.println("Price       : " + harga);
        System.out.println("Rating      : " + bintang);
    }

}
