package Pertemuan12.tugas.tugas2;

public class ddlfilm {
    Film head;
    int size;

    public ddlfilm() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public void size(){
        System.out.println(size);
    }

    public void print() {
        if (!isEmpty()) {
            Film list = head;
            System.out.println("---------------------------------------------------");
            System.out.printf("| %-5s | %-30s | %-6s |\n", "ID", "Nama Film", "Rating");
            System.out.println("---------------------------------------------------");
            while (list != null) {
                System.out.printf("| %-5d | %-30s | %-6s |\n", list.id_film, list.nama_film, list.rate_film);
                list = list.next;
            }
            System.out.println("---------------------------------------------------");
        } else {
            System.out.println("Tidak ada film yang tersedia");
        }
    }

    public void addFirst(int id, String nama, Double rate) {
        if (isEmpty()) {
            head = new Film(null, id, nama, rate, null);
        } else {
            Film filmBaru = new Film(null, id, nama, rate, head);
            head.prev = filmBaru;
            head = filmBaru;
        }
        size++;
    }

    public void addLast(int id, String nama, Double rate) {
        if (isEmpty()) {
            addFirst(id, nama, rate);
        } else {
            Film current = head;
            while (current.next != null) {
                current = current.next;
            }
            Film filmBaru = new Film(current, id, nama, rate, null);
            current.next = filmBaru;
            size++;
        }
    }

    public void add(int id, String nama, Double rate, int index) {
        if (isEmpty() || index == 0) { //segala add first
            addFirst(id, nama, rate);
        } else if (index < 0 || index > size) {
            System.out.println("Nilai indeks di luar batas");
        } else {
            Film current = head;
            int i = 0;
            while (i < index-1) {
                current = current.next;
                i++;
            }
            if (current.next == null) { //addlast
                Film newNode = new Film(current, id, nama, rate, null);
                current.next = newNode;
            } else {
                current = current.next; // biar apa? biar ga error la hm
                Film newNode = new Film(current.prev, id, nama, rate, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
            size++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Tidak ada daftar Film");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Tidak ada daftar Film");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Film current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak tersedia");
        } else if (index == 0) {
            removeFirst();
        } else {
            Film current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.prev;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void cariID(int idKey) {
        Film list = head;
        int count = 1;
        for (int i = 0; i < size; i++) {
            if (list.id_film != idKey) {
                list = list.next;
                count++;
            }
        }
        if (count < 0 || count > size) {
            System.out.println("ID Film Tidak Ditemukan");
        } else {
            System.out.println("Data ID Film : " + idKey + " berada di node ke - " + (count));
            System.out.println("IDENTITAS : ");
            System.out.printf("%-13s : %-5d\n", "ID Film", list.id_film);
            System.out.printf("%-13s : %-30s\n", "Judul Film", list.nama_film);
            System.out.printf("%-13s : %-5s\n", "IMDB Rating", list.rate_film);
        }
    }

    void insertionSortDesc() {
        if (head == null || head.next == null) { // 1
            return; // 2
        }
        Film sorted = null; // 3
        Film current = head; // 4

        while (current != null) { // 5
            Film next = current.next;// 6 masukkan posisi setelah C ke dalam C
            if (sorted == null || sorted.rate_film <= current.rate_film) {// 7 angka terbesar telah disortir < angka current
                current.next = sorted;// 8 / masukkan S terbesar ke dalam C.n as next
                if (sorted != null) {// 9
                    sorted.prev = current;// 10 masukkan C ke dalam S.p terbesar as prev
                }
                sorted = current;// 11 buat value C menjadi S terbesar
                sorted.prev = null;// 12 buat S.p terbesar menjadi null
            } else { // angka current > dari angka terbesar yang telah di sortir
                Film temp = sorted;// 13 simpan S terbesar ke var T
                while (temp.next != null && temp.next.rate_film > current.rate_film) {// 14 angka pertama setelah S terbesar > C
                    temp = temp.next;// 15 pindahkan T ke angka pertama setelah T (misal 8,6,2. posisi T dari 8 ke 6) dst
                }
                current.next = temp.next;// 16 pindahkan value T.n ke C.n
                if (temp.next != null) {// 17
                    temp.next.prev = current;// 18 buat C menjadi prev dari T.n (C=4. T=6 S = 6,2. p6n 42 p2n. menjadi p6n 42 42n)
                }
                temp.next = current;// 19 buat C menjadi next dari T (C=4. T=6 S = 6,2. p6n p2n. menjadi p64 42 42n)
                current.prev = temp;// 20 buat T menjadi prev dari C (C=4. T=6 S = 6,2. p6n p2n. menjadi p64 642 42n)
            }
            current = next;// 21 masukkan nilai N ke C. loop lagi kalau next != null
        }
        head = sorted;// 22 return ke head biar sorting nya work
    }

}
