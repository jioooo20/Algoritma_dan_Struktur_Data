package Pertemuan12.tugas.tugas1;

public class pasien {
    int no;
    String nama;
    pasien prev, next;

    public pasien(pasien prev, int no, String nama, pasien next){
        this.prev = prev;
        this.no = no;
        this.nama = nama;
        this.next = next;
    } 
}
