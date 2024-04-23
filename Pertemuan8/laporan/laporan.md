# Laporan Jobsheet 7

```
Nama : Giovano Alkandri
Nim : 2341720096
Kelas : TI-1H
```

## Percobaan 1: Penyimpanan Tumpukan Barang dalam Gudang

### 7.1.1 Verifikasi Hasil Percobaan

**Contoh verifikasi hasil percobaan**

![alt text](image.png) ![alt text](image-1.png)

**Hasil Program**

![alt text](image-2.png) ![alt text](image-3.png)  

![alt text](image-4.png)  

![alt text](image-5.png)


### 7.1.2 Pertanyaan

1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana saja yang perlu diperbaiki?  

        Bagian yang perlu diperbaiki ada pada 
        
        kode method lihatBarangTeratas(). Seharusnya pada baris kedua bukan if (!isEmpty()), tapi if (!cekKosong())

        dan public void tampilkanBarang(). Seharusnya pada baris kelima bukan  for (int i = 0; i < top; i++), tapi  for (int i = 0; i < top+1; i++)


2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode programnya!

        Data barang yang dapat ditampung dalma tumpukan adalah 7 data barang  
        Kode ada pada class main, kode tersebut adalah: 
        Gudang13 gudang = new Gudang13(7);

3. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi tersebut dihapus, apa dampaknya?

        Pengecekan kondisi tersebut perlu dilakukan agar data barang yang diinput tidak overload. Jika kondisi tersebut dihapus akan berdampak pada kode yang lainnya sehingga akan menghasilkan error

4. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat barang teratas, serta dapat secara bebas menentukan kapasitas gudang!  

        Kode mementukan kapasitas gudang : 

        System.out.print("Masukkan Kapasitas Gudang : ");
        int cap = scanner.nextInt();
        scanner.nextLine();
        Gudang13 gudang = new Gudang13(cap);

        Kode melihat barang teratas: 

        gudang.lihatBarangTeratas();
          

5. Commit dan push kode program ke Github



## 7.4 Latihan Praktikum


