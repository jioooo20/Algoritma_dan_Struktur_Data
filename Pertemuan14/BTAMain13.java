package Pertemuan14;

public class BTAMain13 {
    public static void main(String[] args) {
        System.out.println("\n\n");

        BTArray13 bta = new BTArray13();

        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");
        System.out.print("\nPreOrder Traversal : ");
        bta.traversePreOrder(0);
        System.out.println("\n");
        System.out.print("\nPostOrder Traversal : ");
        bta.traversePostOrder(0);
        System.out.println("\n");
    }
}
 