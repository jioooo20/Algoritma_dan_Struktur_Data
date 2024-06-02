package Pertemuan14;

public class BTMain13 {
    public static void main(String[] args) {
        System.out.println("\n\n");
        BinaryTree13 bt = new BinaryTree13();
        
        bt.addRekur(6);
        bt.addRekur(4);
        bt.addRekur(8);
        bt.addRekur(3);
        bt.addRekur(5);
        bt.addRekur(7);
        bt.addRekur(9);
        bt.addRekur(10);
        bt.addRekur(15);

        System.out.println("Add Rekursif");
        System.out.println("=========================");
        System.out.print("InOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("\n=========================");
        System.out.println("Nilai terkecil : " + bt.findMin());
        System.out.println("Nilai Terbesar : " + bt.findMax());
        System.out.println("=========================");
        System.out.print("Nilai tersimpan pada node leaf : " );
        bt.PrintValueLeaf(bt.root);
        System.out.print("\nJumlah node pada leaf : " + bt.HitungJumLeaf(bt.root));
        
        System.out.println("\n=========================");



        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("inOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node : " + bt.find(5));
        System.out.println("Delet Node 8");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal : " );
        bt.traversePreOrder(bt.root);
        System.out.println("");





    }
    
}
