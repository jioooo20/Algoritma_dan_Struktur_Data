package Pertemuan6;

public class Main {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara ", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Nusa", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Nusa", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Nusa", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sblm sorting :");
        list.tampil();

        System.out.println("Data mhs setelah sorting asc berdasarkan ipk");
        // list.bubbleSort();
        // list.selectionSort();
        // list.insertionSortAsc();
        list.insertionSortDesc();
        list.tampil();

    }
}
