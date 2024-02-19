package Pertemuan2;

public class Buku13 {
    String judul, pengarang;
    int halaman, stok, harga, jml;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang  : " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    void terjual(int jml) {
        this.jml = jml;
        if (stok >= jml) {
            stok -= jml;
        } else {
            System.out.println("Stok hanya tersisa " + stok);
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal() {
        int total = jml * harga;
        return total;
    }

    double hitungDiskon() {
        int total = hitungHargaTotal();
        double diskon = 0;
        if (total > 150000) {
            diskon = total * 0.12;
        } else if (total >= 75000 && total <= 150000) {
            diskon = total * 0.05;
        } else {
            System.out.println("Anda gak dapat diskon :D");
        }
        return diskon;
    }

    void hitungHargaBayar() {
        double bayar = hitungHargaTotal() - hitungDiskon();

        System.out.println("Harga yang dibayar setelah diskon: " + bayar);
    }

    public Buku13() {

    }

    public Buku13(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

}
