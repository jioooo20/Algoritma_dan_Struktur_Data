package Pertemuan14;

public class BinaryTree13 {
    Node13 root;

    public BinaryTree13() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) { // tree kosong
            root = new Node13(data);
        } else {
            Node13 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node13(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node13(data);
                        break;
                    }
                } else { // data sudah ada
                    break;
                }
            }
        }
    }

    // tugas 1
    void addRekur(int data) {
        root = Rekur(root, data);
    }

    private Node13 Rekur(Node13 current, int data) {
        if (current == null) {
            return new Node13(data);
        }

        if (data < current.data) {
            current.left = Rekur(current.left, data);
        } else if (data > current.data) {
            current.right = Rekur(current.right, data);
        }
        return current;
    }
    //-=-=-=


    boolean find(int data) {
        boolean result = false;
        Node13 current = root;
        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    //tugas 2

    int findMin() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
        }
        Node13 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    int findMax() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
        }
        Node13 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }
    //-=-=-=

    //tugas 3
    void PrintValueLeaf(Node13 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(" " + node.data);
            }
            PrintValueLeaf(node.left);
            PrintValueLeaf(node.right);
        }
    }

    //tugas 4

    int HitungJumLeaf(Node13 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return HitungJumLeaf(node.left) + HitungJumLeaf(node.right);
    }

    void traversePreOrder(Node13 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node13 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node13 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node13 getSucessor(Node13 del) {
        Node13 successor = del.right;
        Node13 sucessorParent = del;
        while (successor.left != null) {
            sucessorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            sucessorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("tree is empty");
            return;
        }
        // find node(current) that will be deleted
        Node13 parent = root;
        Node13 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // deletion
        if (current == null) {
            System.out.println("data tidak ditemukan");
            return;
        } else {
            // klo gada child, tinggal hapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { // 1 child kanan
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else if (current.right == null) { // 1 chil dkiri
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { // kalo ada 2 child
                Node13 successor = getSucessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}
