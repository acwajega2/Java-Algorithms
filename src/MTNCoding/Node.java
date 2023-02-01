package MTNCoding;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Node {
    int data;
    Node leftNode;
    Node rightNode;

    public Node(int val) {
        data = val;
    }

    void insert(int val) {
        Node node = new Node(val);
        if (val <= data) {
            //-------> we put it to the left
            if (leftNode == null) {
                leftNode = node;
            } else {
                //--> we iterate through
                leftNode.insert(val);
            }
        } else {
            //-------> we put it to the right
            if (rightNode == null) {
                rightNode = node;
            } else {
                //--> we iterate through
                rightNode.insert(val);
            }


        }

    }

    void printInOrder() {
        if (leftNode != null) {
            leftNode.printInOrder();
        }
        System.out.println(data);
        if (rightNode != null) {
            rightNode.printInOrder();
        }
    }

}
