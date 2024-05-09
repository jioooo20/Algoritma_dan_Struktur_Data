package Pertemuan10.tugas;

public class queue {
    public pembeli13[] antrian;
    public int front, rear, size, max;

    public queue(int n) {
        max = n;
        antrian = new pembeli13[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(pembeli13 antri) {
        if (isFull()) {
            System.out.println("Full");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = antri;
            size++;
        }
    }

    public pembeli13 dequeue() {
        pembeli13 antri = new pembeli13();
        if (isEmpty()) {
            System.out.println("kosong ");
        } else {
            antri = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return antri;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("kosong ");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHp);
            i = (i + 1) % max;
            System.out.println("Jumlah Pembeli: " + size);
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println(antrian[front].nama + " " + antrian[front].noHp);
        } else {
            System.out.println("Kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println(antrian[rear].nama + " " + antrian[rear].noHp);
        } else {
            System.out.println("Kosong");
        }
    }

    public void peekPosisi(String n) {
        for (int i = 0; i < antrian.length; i++) {
            if (antrian[i]!= null && antrian[i].nama.equals(n)) {
                System.out.println(n + " berada pada antrian ke " + (i+1));
            }
        }
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("kosong ");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHp);
            i = (i + 1) % max;
            System.out.println("Jumlah Pembeli: " + size);
        }
    }

}
