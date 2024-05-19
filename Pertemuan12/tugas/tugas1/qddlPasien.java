package Pertemuan12.tugas.tugas1;

public class qddlPasien {
    pasien head;
    int size;

    public qddlPasien() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void tambahAntrian(int no, String nama) {
        if (isEmpty()) {// nambah antrian pertama saat kosong
            head = new pasien(null, no, nama, head);
            size++;
        } else {
            pasien current = head;
            while (current.next != null) {
                current = current.next;
            }
            pasien newPasien = new pasien(current, no, nama, null);
            current.next = newPasien;
            size++;
        }
    }

    public void hapusAntrian() throws Exception {
        if (!isEmpty()) {
            System.out.println(head.nama + " telah selesai divaksinasi.");
        }
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else if (size == 1) {
            head = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }

    }

    public void print() {
        if (!isEmpty()) {
            pasien temp = head;
            System.out.println("+++++++++++++++++++++++++");
            System.out.println("Daftar Antrian Vaksin");
            System.out.printf("| %-5s | %-15s |", "No.", "Nama Pasien");
            while (temp != null) {
                System.out.printf("\n| %-5d | %-15s |", temp.no, temp.nama);
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("Antrian Kosong");
        }
    }
}
