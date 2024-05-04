package Pertemuan8;

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
            for (int i = top; i >=0; i--) {
            // for (int i = 0; i < top + 1; i++) {
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
