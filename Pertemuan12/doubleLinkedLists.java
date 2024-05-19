package Pertemuan12;

/**
 * doubleLinkedLists
 */
public class doubleLinkedLists {

    Node head;
    int size;

    public doubleLinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node(null, item, head);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) {
        if (isEmpty() || index == 0) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            System.out.println("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index-1) {
                current = current.next;
                i++;
            }
            if (current.next == null) { //addlast
                Node newNode = new Node(current, item,null );
                current.next = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;

    }

    public void print() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println("\n berhasil diisi");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    // PRAK2

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("nilai index diluat batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
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

    // PRAK3

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        return temp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index > size || index < 0) {
            throw new Exception("Nilai index di luar batas");
        }
        Node temp = head;
        for (int i = 1; i < index + 1; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
}