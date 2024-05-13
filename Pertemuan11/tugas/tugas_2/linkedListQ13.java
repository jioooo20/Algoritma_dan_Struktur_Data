package Pertemuan11.tugas.tugas_2;

import Pertemuan11.tugas.tugas1.layananAntri13;

public class linkedListQ13 {
    public node13 first, last;

    boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }
 
 void print() {
        if (!isEmpty()) {
            node13 temp = first;
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

    void enqueue(int data, String nama) {
        node13 newNode = new node13(data, nama);

        if (isEmpty()) {
            this.first = this.last = newNode;
            return;
        }
        this.last.next = newNode;
        this.last = newNode;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong");
            return;
        }

        node13 temp = this.first;
        this.first = this.first.next;

        if (this.first == null)
            this.last = null;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return -1;
        }
        return this.first.nim;
    }

}
