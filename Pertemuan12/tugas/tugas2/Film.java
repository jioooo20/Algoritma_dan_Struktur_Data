package Pertemuan12.tugas.tugas2;

public class Film {
    int id_film;
    String nama_film;
    Double rate_film;
    Film prev, next;

    public Film(Film prev, int id, String nama, Double rate, Film next) {
        this.prev = prev;
        id_film = id;
        nama_film = nama;
        rate_film = rate;
        this.next = next;
    }
}

