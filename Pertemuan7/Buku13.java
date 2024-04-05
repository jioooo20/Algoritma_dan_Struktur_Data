package Pertemuan7;

public class Buku13 {
    int kdBuku;
    String judulBuku;
    int thnTerbit;
    String pengarang;
    int stok;

    public Buku13(int kd, String title, int terbit, String author, int stok) {
        kdBuku = kd;
        judulBuku = title;
        thnTerbit = terbit;
        pengarang = author;
        this.stok = stok;
    }

    void printBuku() {
        System.out.println("======================");
        System.out.println("Kode Buku           : " + kdBuku);
        System.out.println("Judul Buku          : " + judulBuku);
        System.out.println("Tahun Terbit Buku   : " + thnTerbit);
        System.out.println("Pengarang           : " + pengarang);
        System.out.println("Stok Buku           : " + stok);
    }

}
