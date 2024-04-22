package uts;

public class uts {
    int angka;

    public uts(int angka) {
        this.angka = angka;
    }

    void PrintAngkaAwal() {
        System.out.print(angka);
        System.out.print(", ");
    }

}

class proses {
    uts nilai[] = new uts[17];
    int index;

    void tambah(uts a) {
        if (index < nilai.length) {
            nilai[index] = a;
            index++;
        } else {
            System.out.println("full");
        }
    }

    void PrintAwalSemua() {
        for (uts a : nilai) {
            a.PrintAngkaAwal();
        }
    }

    void insertionSortAsc() {

        for (int i = 1; i < nilai.length; i++) {
            uts temp = nilai[i];
            int j = i;
            while (j > 0 && nilai[j - 1].angka > temp.angka) {
                nilai[j] = nilai[j - 1];
                j--;
            }
            nilai[j] = temp;
        }
    }

    public int FindBinarySearch(int cari, int l, int r) {

        int m;
        if (r >= l) {
            m = (l + r) / 2;
            if (cari == nilai[m].angka) {
                return m;
            } else if (cari < nilai[m].angka) {
                return FindBinarySearch(cari, l, m - 1);
            } else {
                return FindBinarySearch(cari, m + 1, r);
            }
        }
        return -1;
    }

    void PrintHasil(int posisi, int cari){
        if (posisi != -1) {
            System.out.println("Angka " + cari + " berada pada index " + posisi);
        }else{
            System.out.println("Data " + cari + " yang anda cari tidak ditemukan");
        }
    }



}

// int dobel(int cari){
//     int count = 0;
//     for (int i = 0; i < nilai.length; i++) {
//         if (nilai[i].angka != 0 && nilai[i].angka == cari) {
//             count++;
//         }
//     }
//     return count;
// }

// int[] caridobel(int cari){
//     int count = dobel(cari);
//     int[] list = new int[count];

//     for (int i = 0; i < list.length; i++) {
//         if (nilai[i].angka != 0 && nilai[i].angka == cari) {
//             list[i] = nilai[i].angka;
//         }
//     }
//     return list;
// } lupa cara save index array pak