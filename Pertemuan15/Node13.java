package Pertemuan15;

public class Node13 {
    int data, jarak;
    Node13 prev, next;

    Node13(Node13 prev, int data, int jarak, Node13 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }

    public void inputTujuan(int t){
        data = t;
    }
    public void inputJarak(int j){
        jarak = j;
    }
}
