package BinaryTree;


public class Main {

    public static void main(String[] args) {


    }

    public static void preOrderTraversal(Node n) {
        if (n == null) {
            return;
        }
        System.out.println(n.data + " ");
        preOrderTraversal(n.leftChild);
        preOrderTraversal(n.rightChild);

    }

    public static void postOrderTraversal(Node n) {
        if (n == null){
            return;
        }
        postOrderTraversal(n.leftChild);
        postOrderTraversal(n.rightChild);
        System.out.println(n.data + " ");
    }

    public static void inOrderTraversal(Node n) {
        if (n == null){
            return;
        }

        inOrderTraversal(n.leftChild);
        System.out.println(n.data + " ");
        inOrderTraversal(n.rightChild);


    }

//    public static void crazy(List<String> input){
//
//        crazy(input);
//        System.out.println(cr);
//
//    }

    public static Node createData() {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");

        a.leftChild = b;
        a.rightChild = g;
        b.leftChild = c;
        b.rightChild = d;
        c.leftChild = e;
        e.rightChild = f;


        return a;
    }
}
