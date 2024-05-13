package Pertemuan11.tugas.tugas_2;

public class antrianLinkedQ13 {
    public static void main(String[] args) {
        linkedListQ13 queue = new linkedListQ13();
        System.out.println("Antrian:");
        queue.enqueue(111, "Anton");
        // queue.print();
        queue.enqueue(112, "Prita");
        // queue.print();
        queue.enqueue(113, "Yusuf");
        // queue.print();
        queue.enqueue(114, "Doni");
        // queue.print();
        queue.enqueue(115, "Sari");
        queue.print(); 
        System.out.println();

        System.out.println("Peek antrian terdepan: " + queue.peek());
        queue.dequeue();
        queue.dequeue();

        System.out.println();
        System.out.println("Antrian setelah dequeue 2 antrian");
        queue.print();
        System.out.println();
    }
}
