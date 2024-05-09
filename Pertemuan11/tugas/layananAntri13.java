package Pertemuan11.tugas;

public class layananAntri13 {
    public int nim;
    public String nama;
    public layananAntri13 next;

    public layananAntri13(int nim,String nama, layananAntri13 next) {
        this.nim = nim;
        this.nama = nama;
        this.next = next;
    }

    public layananAntri13() {
    }
}
