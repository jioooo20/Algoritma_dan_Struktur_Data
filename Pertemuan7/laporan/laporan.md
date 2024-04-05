# Laporan Jobsheet 6

```
Nama : Giovano Alkandri
Nim : 2341720096
Kelas : TI-1H
```

## 6.1 Searching / Pencarian Menggunakan Agoritma Sequential Search

### 6.1.1 Verifikasi Hasil Percobaan

**Contoh verifikasi hasil percobaan**

![alt text](image-1.png) ![alt text](image-2.png)

**Hasil Program**

**Jika data ditemukan:**

![alt text](image-3.png)

**Jika data tidka ditemukan:**

![alt text](image-4.png)

### 6.1.2 Pertanyaan

1.  Jelaskan fungsi break yang ada pada method FindSeqSearch!

        fungsi break digunakan untuk keluar dari perulangan jika data telah ditemukan.

2.  Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?

        program tetap berjalan dan hasil yang dikeluarkan benar karena metode pencarian dilakukan dengan mencocokkan data yang ada, jika data cocok maka pencarian berhenti.

    ![alt text](image-6.png) ![alt text](image-7.png)

3.  Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe method dari FindBuku adalah BukuNoAbsen. Sehingga Anda bisa memanggil method tersebut pada class BukuMain seperti gambar berikut :  
    ![alt text](image-5.png)

    ```
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
    ```

    ![alt text](image-8.png)

## 6.2 Searching / Pencarian Menggunakan Binary Search

### 6.2.1 Verifikasi Hasil Percobaan

**Contoh verifikasi hasil percobaan**

![alt text](image-9.png)

**Hasil Program**

![alt text](image-10.png) ![alt text](image-14.png)

### 6.2.2 Pertanyaan

1.  Tunjukkan pada kode program yang mana proses divide dijalankan!

    ![alt text](image-12.png)

2.  Tunjukkan pada kode program yang mana proses conquer dijalankan!

    ![alt text](image-13.png)

3.  Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?

        Program tetap dapat dijalankan tanpa ada masalah.

    ![alt text](image-10.png) ![alt text](image-14.png)

4.  Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214, 20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai!

        Hasil yang dikeluarkan tidak sesuai karena kode belum memenuhi metode binary search yang harus dilakukan sorting terlebih dahulu. Dibawah ini adalah kode inertion Sort yang digunkaan untuk melakukan sorting pada metode binary search

```
    void insertionSortAsc() {
        for (int i = 1; i < listBk.length; i++) {
            Buku13 temp = listBk[i];
            int j = i;
            while (j > 0 && listBk[j - 1].kdBuku > temp.kdBuku) {
                listBk[j] = listBk[j - 1];
                j--;
            }
            listBk[j] = temp;
        }
    }
```

## 6.3 Percobaan Pengayaan Divide and Conquer

### 6.3.1 Verifikasi Hasil Percobaan Percobaan Merge Sort

**Contoh verifikasi hasil percobaan**

![alt text](image-11.png)

**Hasil Program Percobaan Merge Sort**

![alt text](image-15.png)

## 6.4 Latihan Praktikum
