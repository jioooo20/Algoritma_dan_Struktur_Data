package Pertemuan6;

public class HotelService {
    Hotel kamar[] = new Hotel[7];
    int indeks;

    void tambah(Hotel H) {
        if (indeks < kamar.length) {
            kamar[indeks] = H;
            indeks++;
        } else {
            System.out.println(" Kamar Penuh");
        }
    }

    void tampilAll() {
        for (Hotel hotel : kamar) {
            hotel.spill();
            System.out.println("=====================");
        }
    }

    void bubblesort() { // Ascending
        for (int i = 0; i < kamar.length - 1; i++) {
            for (int j = 1; j < kamar.length - i; j++) {
                if (kamar[j].bintang > kamar[j - 1].bintang) {
                    Hotel temp = kamar[j];
                    kamar[j] = kamar[j - 1];
                    kamar[j - 1] = temp;
                }
            }
        }
    }

    void selecsort() { // descending
        for (int i = 0; i < kamar.length - 1; i++) {
            int indeksMin = i;
            for (int j = i + 1; j < kamar.length; j++) {
                if (kamar[j].harga < kamar[indeksMin].harga) {
                    indeksMin = j;
                }
            }
            Hotel temp = kamar[indeksMin];
            kamar[indeksMin] = kamar[i];
            kamar[i] = temp;
        }
    }
}
