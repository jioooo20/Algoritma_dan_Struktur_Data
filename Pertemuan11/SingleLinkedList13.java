package Pertemuan11;

public class SingleLinkedList13 {
    Node13 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node13 temp = head;
            System.out.print("Isi linked list : \t");
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
                // break;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    void addFirst(int input) {
        Node13 ndInput = new Node13(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node13 ndInput = new Node13(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node13 ndInput = new Node13(input, null);
        Node13 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int input) {
        // Node13 ndInput = new Node13();
        if (index < 0) { //ini dihapus aja juga gapapa la brow
            System.out.println("gx bs negatip");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node13 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node13(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    // p2

    int getData(int index) {// ambil nilai data tepat pada index tertentu
        Node13 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    int indexOf(int key) {// mencari posisi node pada index mana
        Node13 temp = head;
        int index = 0;
        while (temp != null && temp.data != key) {
            temp = temp.next;
            index++;
            if (temp.data == key) {
                break;
            }
        }
        if (temp == null) {
            return -1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong," + " tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong," + " tidak dapat dihapus");
        } else if (head != tail) {
            Node13 temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
        }
    }

    void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong," + " tidak dapat dihapus");
        } else {
            Node13 temp = head;
            while (temp != null) {
                if (temp.data == key && temp == head) {
                    removeFirst();
                    break;
                } else if (temp.next.data == key) {
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

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node13 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }

}
