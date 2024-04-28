package Pertemuan8;

import java.util.Scanner;

public class Barang13 {
    public int kode;
    public String nama, kategori;

    public Barang13(int kode, String nama, String kategori) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
    }
}

class Gudang13 {
    Barang13[] tumpukan;
    int size, top;

    public Gudang13(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang13[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang13 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudab penuh");
        }
    }

    public Barang13 ambiBarang13() {
        if (!cekKosong()) {
            Barang13 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari gudang");
            System.out.println("Kode dalam biner: " + konversiDesimalkeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang13 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang13 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas : " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang13 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang13 barangBawah = tumpukan[0];
            System.out.println("Barang terbawah : " + barangBawah.nama);
            return barangBawah;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void cariKode(int kd) {
        int a = -1;
        for (int i = 0; i < tumpukan.length; i++) {
            if (kd == tumpukan[i].kode) {
                a = i;
                break;
            }
        }
        if (a == -1) {
            System.out.println("Gaada");
        } else {
            System.out.println("Detail informasi dari kode barang " + kd);
            System.out.println("Nama barang: " + tumpukan[a].nama);
            System.out.println("Kategori barang: " + tumpukan[a].kategori);
        }

    }

    public void cariNama(String cari) {
        int a = -1;
        for (int i = 0; i < tumpukan.length; i++) {
            if (cari.equalsIgnoreCase(tumpukan[i].nama)) {
                a = i;
                break;
            }
        }
        if (a == -1) {
            System.out.println("Gaada");
        } else {
            System.out.println("Detail informasi dari kode barang " + cari);
            System.out.println("Kode barang: " + tumpukan[a].kode);
            System.out.println("Kategori barang: " + tumpukan[a].kategori);
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang : ");
            // for (int i = top; i >=0; i--) {
            for (int i = 0; i < top + 1; i++) {
                System.out.printf("Kode %d: %s (Kategori %s )\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String konversiDesimalkeBiner(int kode) {
        StackKonversi13 stack = new StackKonversi13();
        while (kode != 0) { // atau kode>0
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

}

class StackKonversi13 {
    int size, top;
    int[] tumpukanBiner;

    public StackKonversi13() {
        this.size = 32; // asumsi 32 bit
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Kosong");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }

}

class utama13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kapasitas Gudang : ");
        int cap = scanner.nextInt();
        scanner.nextLine();
        Gudang13 gudang = new Gudang13(cap);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Cari (kode)");
            System.out.println("7. Cari (nama)");
            System.out.println("0. keluar");
            System.out.print("Pilih Operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang13 barangBaru = new Barang13(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    gudang.konversiDesimalkeBiner(kode);
                    break;
                case 2:
                    gudang.ambiBarang13();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("Masukkan kode : ");
                    int kodd = scanner.nextInt();
                    scanner.nextLine();
                    gudang.cariKode(kodd);
                    break;
                case 7:
                System.out.print("Masukkan nama : ");
                    String namm = scanner.nextLine();
                    gudang.cariNama(namm);
                    break;
                default:
                    System.out.println("Pilih angka 1 - 5");
                    break;
            }
        }
    }
}