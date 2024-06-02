package Pertemuan14;

public class BTArray13 {
    int[] data;
    int idxLast;

    public BTArray13(){
        data = new int[10];
    }

    //tugas 5.1
    void add(int nilai) {
        if (idxLast < data.length - 1) {
            idxLast++;
            data[idxLast] = nilai;
        } else {
            System.out.println("Tree penuh");
        }
    }

    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    //=-=-=

    void traverseInOrder(int idxStart){
        if (idxStart<=idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }

    //tugas 5.2
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2* idxStart+1);
            traversePreOrder(2*idxStart+2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2*idxStart+1);
            traversePostOrder(2*idxStart+2);
            System.out.print(data[idxStart] + " ");
        }
    }
    //=-=-=-=
}
 