package Pertemuan11.tugas.tugas1;

public class LLlayanan13 {
    layananAntri13 head, tail;

    boolean kosongKH() {
        return head == null;
    }

    void print() {
        if (!kosongKH()) {
            layananAntri13 temp = head;
            int i = 1;
            System.out.println("Isi linked list : ");
            System.out.println("---------------------------------------------");
            System.out.printf("| %-3s| %-5s| %-30s|", "No", "NIM", "Nama Mahasiswa");
            System.out.print("\n---------------------------------------------");
            while (temp != null) {
                System.out.printf("\n| %-3d| %-5s| %-30s|", i, temp.nim, temp.nama);
                temp = temp.next;
                i++;
                // break;
            }
            System.out.println("\n---------------------------------------------");
        } else {
            System.out.println("Tidak ada antrian");
        }
    }

    void tambahDepan(int nim, String nama) {
        layananAntri13 input = new layananAntri13(nim, nama, null);
        if (kosongKH()) {
            head = input;
            tail = input;
        } else {
            input.next = head;
            head = input;
        }
    }

    void tambahBelakang(int nim, String nama) {
        layananAntri13 input = new layananAntri13(nim, nama, null);
        if (kosongKH()) {
            head = input;
            tail = input;
        } else {
            tail.next = input;
            tail = input;
        }
    }

    void tambahSetelah(int nim, String nama, int keyNIM) {
        layananAntri13 input = new layananAntri13(nim, nama, null);
        layananAntri13 temp = head;
        do {
            if (temp.nim == keyNIM) {
                input.next = temp.next;
                temp.next = input;
                if (input.next == null) {
                    tail = input;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }

    void tambahDimana(int nim, String nama, int posisi) {
        if (posisi == 1) { // menambahkan data berdasarkan urutan, bukan index
            tambahDepan(nim, nama);
        } else {
            layananAntri13 temp = head;
            for (int i = 0; i < posisi - 2; i++) {// mencari urutan, bukan index
                temp = temp.next;
            }
            temp.next = new layananAntri13(nim, nama, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    // hapus bang

    int getNim(int posisi) {// ambul nim pada nomor tertentu
        layananAntri13 temp = head;
        for (int i = 1; i < posisi; i++) {
            temp = temp.next;
        }
        return temp.nim;
    }
    String getNama(int posisi) {// ambul nama pada nomor tertentu
        layananAntri13 temp = head;
        for (int i = 1; i < posisi; i++) {
            temp = temp.next;
        }
        return temp.nama;
    }

    int posisiKe(int nimKey) { //mencari posisi node
        layananAntri13 temp = head;
        int pos = 1;
        while (temp != null && temp.nim != nimKey) {
            temp = temp.next;
            pos++;
            if (temp.nim == nimKey) {
                break;
            }
        }
        if (temp == null) {
            return -1;
        } else {
            return pos;
        }
    }
    
    void hapusDepan(){
        if (kosongKH()) {
            System.out.println("Tidak ada antrian");
        }else if (head == tail) {
            head = tail = null;
        } else{
            head = head.next;
        }
    }

    void hapusBelakang() {
        if (kosongKH()) {
            System.out.println("Tidak ada antrian ");
        } else if (head != tail) {
            layananAntri13 temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
        }
    }

    void hapus(int nimKey) {
        if (kosongKH()) {
            System.out.println("Tidak ada antrian");
        } else {
            layananAntri13 temp = head;
            while (temp != null) {
                if (temp.nim == nimKey && temp == head) {
                    hapusBelakang();
                } else if (temp.next.nim == nimKey) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    void hapusDimana(int posisi) {
        if (posisi == 1) {
            hapusDepan();
        } else {
            layananAntri13 temp = head;
            for (int i = 1; i < posisi-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
