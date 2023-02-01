package Andela;



public class Node {
    Node leftNode;
    Node rightNode;
    int data;
    public Node(int data){
        this.data = data;
    }

    public void insert(int input){
        Node node = new Node(input);
        if (input <= data){
            if (leftNode == null){
                leftNode = node;
            }
            else {
                leftNode.insert(input);
            }
        } else {
            //---------> inserting right node
            if (rightNode == null){
                rightNode = node;
            }
            else {
                rightNode.insert(input);
            }
        }


    }


    //-----------------> In Order Traverse -------
    public void inOrderTraversal(){

        inOrderTraversal();
        System.out.println(data);
        inOrderTraversal();

    }


    public void printInOrder() { /// LEFT PARENT RIGHT
        if (leftNode != null) {
            leftNode.printInOrder();
        }
        System.out.println(data);

        if (rightNode != null) {
            rightNode.printInOrder();
        }
    }

}
