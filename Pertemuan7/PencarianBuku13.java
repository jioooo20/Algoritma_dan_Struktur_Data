package Pertemuan7;

public class PencarianBuku13 {
    Buku13 listBk[] = new Buku13[5];
    int indeks;

    void tambah(Buku13 m) {
        if (indeks < listBk.length) {
            listBk[indeks] = m;
            indeks++;
        } else {
            System.out.println("full");
        }
    }

    void tampil() {
        for (Buku13 m : listBk) {
            m.printBuku();
        }
    }

    // int findseqSearch(int find) { // kdBuku int
    // int awal = -1;
    // for (int i = 0; i < listBk.length; i++) {
    // if (find == listBk[i].kdBuku) {
    // awal = i;
    // break;
    // }
    // }
    // return awal;
    // }

    int findseqSearch(String find) { // kdBuku String
        int awal = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (find.equalsIgnoreCase(listBk[i].kdBuku)) {
                awal = i;
                break;
            }
        }
        return awal;
    }

    Buku13 findbuku(String find) {
        int awal = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (find.equalsIgnoreCase(listBk[i].judulBuku)) {
                awal = i;
                break;
            }
        }
        return listBk[awal];
    }

    // void insertionSortAsc() {

    // for (int i = 1; i < listBk.length; i++) {
    // Buku13 temp = listBk[i];
    // int j = i;
    // while (j > 0 && listBk[j - 1].kdBuku > temp.kdBuku) {
    // listBk[j] = listBk[j - 1];
    // j--;
    // }
    // listBk[j] = temp;
    // }
    // }

    void StrInsertionSortAsc() {
        for (int i = 1; i < listBk.length; i++) {
            Buku13 temp = listBk[i];
            int j = i;
            while (j > 0 && listBk[j - 1].kdBuku.compareTo(temp.kdBuku) > 0) {
                listBk[j] = listBk[j - 1];
                j--;
            }
            listBk[j] = temp;
        }
    }

    void StrInsertionSortJudulAsc() {
        for (int i = 1; i < listBk.length; i++) {
            Buku13 temp = listBk[i];
            int j = i;
            while (j > 0 && listBk[j - 1].judulBuku.compareTo(temp.judulBuku) > 0) {
                listBk[j] = listBk[j - 1];
                j--;
            }
            listBk[j] = temp;
        }
    }

    // public int FindBinarySearch(int cari, int l, int r) {

    // int m;
    // if (r >= l) {
    // m = (l + r) / 2;
    // if (cari == listBk[m].kdBuku) {
    // return m;
    // } else if (cari < listBk[m].kdBuku) {
    // return FindBinarySearch(cari, l, m - 1);
    // } else {
    // return FindBinarySearch(cari, m + 1, r);
    // }
    // }
    // return -1;
    // }

    public int StrFindBinarySearch(String cari, int l, int r) {
        int m;
        if (r >= l) {
            m = (l + r) / 2;
            if (cari.equalsIgnoreCase(listBk[m].kdBuku)) {
                return m;
            } else if (cari.compareTo(listBk[m].kdBuku) < 0) {
                return StrFindBinarySearch(cari, l, m - 1);
            } else {
                return StrFindBinarySearch(cari, m + 1, r);
            }
        }
        return -1;
    }

    public int StrFindBukuBinary(String cari, int l, int r) {
        int m;
        if (r >= l) {
            m = (l + r) / 2;
            if (cari.compareToIgnoreCase(listBk[m].judulBuku) == 0) {
                return m;
            } else if (cari.compareToIgnoreCase(listBk[m].judulBuku) < 0) {
                return StrFindBukuBinary(cari, l, m - 1);
            } else {
                return StrFindBukuBinary(cari, m + 1, r);
            }
        }
        return -1;
    }

    void printPosisi(String x, int pcc) {
        if (pcc != -1) {
            System.out.println("data : " + x + " ditemukan pada index " + pcc);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void printData(String x, int pcc) {
        if (pcc != -1) {
            System.out.println("Kode Buku : " + x);
            System.out.println("Judul : " + listBk[pcc].judulBuku);
            System.out.println("Tahun Terbit : " + listBk[pcc].thnTerbit);
            System.out.println("Pengarang : " + listBk[pcc].pengarang);
            System.out.println("Stok  : " + listBk[pcc].stok);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public int judulDobel(String cari) {
        int hitung = 0;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].judulBuku != null && listBk[i].judulBuku.equalsIgnoreCase(cari)) {
                hitung++;
            }
        }
        return hitung;
    }

}
