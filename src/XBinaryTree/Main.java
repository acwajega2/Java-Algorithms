package XBinaryTree;

public class Main {
    public static void main(String[] args) {

        Node<String> data = createNode();
        preOrderTraversal(data);


    }


    public static void preOrderTraversal(Node<String> n) {
        if (n == null) {
            return;
        }
        System.out.println(n.data + " ");
        preOrderTraversal(n.leftChild);
        preOrderTraversal(n.rightChild);

    }

    public static void postOrderTraversal(Node<String> n) {
        if (n == null){
            return;
        }
        postOrderTraversal(n.leftChild);
        postOrderTraversal(n.rightChild);
        System.out.println(n.data + " ");
    }

    public static void inOrderTraversal(Node<String> n) {
        if (n == null){
            return;
        }

        inOrderTraversal(n.leftChild);
        System.out.println(n.data + " ");
        inOrderTraversal(n.rightChild);


    }

    public static Node<String> createNode(){
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");
        Node<String> g = new Node<>("g");



        a.leftChild = b;
        a.rightChild = c;
        b.leftChild = d;
        b.rightChild = e;
        c.leftChild = f;
        c.rightChild = g;


        return a;
    }


}
