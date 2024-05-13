package Pertemuan11.tugas.tugas1;

public class layananMHS13 {
    public static void main(String[] args) {
        System.out.println("\n\n");

        LLlayanan13 mhs = new LLlayanan13();

        mhs.print();
        mhs.tambahDepan(111, "Anton");
        mhs.print();
        mhs.tambahBelakang(115, "Sari");
        mhs.print();
        mhs.tambahSetelah(112, "Prita", 111);
        mhs.print();
        mhs.tambahDimana(113, "Yusuf", 3);
        mhs.print();
        mhs.tambahSetelah(114, "Doni", 113);
        mhs.print();

        System.out.println("Antrian pertama = " + mhs.getNim(1) + " |  " + mhs.getNama(1));
        System.out.println("Doni berada pada antrian ke - " + mhs.posisiKe(114));

        mhs.hapus(113);
        mhs.print();
        mhs.hapusDimana(2);
        mhs.print();
        mhs.hapusDepan();
        mhs.print();
        mhs.hapusBelakang();
        mhs.print();
    }
}
