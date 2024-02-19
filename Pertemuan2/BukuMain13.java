package Pertemuan2;

public class BukuMain13 {
    public static void main(String[] args) {

        Buku13 bk1 = new Buku13();

        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku13 bk2 = new Buku13("self reward", "Mahhera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku13 NamaMahasiswa = new Buku13("Bisa Menang? ~is", "Yeonjiseo", 231, 13, 74500);
        NamaMahasiswa.terjual(3);
        NamaMahasiswa.tampilInformasi();
    }
}
