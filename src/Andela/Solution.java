package Andela;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {


    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,4,3,6,4,8,9);
        Node root = new Node(nums.get(0));
        AtomicInteger x = new AtomicInteger();
        nums.forEach(val ->{
            if (x.intValue() > 0) {
                root.insert(val);
            }
            x.incrementAndGet();
        });

       System.out.println("PRE ORDER TRAVERSALE");
       preOrderTraversal(root);
       System.out.println("PRE ORDER TRAVERSALE");
       inOrderTraversal(root);
       System.out.println("POST ORDER TRAVERSALE");
       postOrderTraversal(root);
    }


    public static void preOrderTraversal(Node n) {
        if (n == null) {
            return;
        }
        System.out.println(n.data + " ");
        preOrderTraversal(n.leftNode);
        preOrderTraversal(n.rightNode);

    }


    public static void inOrderTraversal(Node n) {
        if (n == null) {
            return;
        }

        preOrderTraversal(n.leftNode);
        System.out.println(n.data + " ");
        preOrderTraversal(n.rightNode);

    }

    public static void postOrderTraversal(Node n) {
        if (n == null) {
            return;
        }

        preOrderTraversal(n.leftNode);
        preOrderTraversal(n.rightNode);
        System.out.println(n.data + " ");

    }



}

