package MTNCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
//        Node root = new Node(89);
//
//        List<Integer> numbers = Arrays.asList(2,13,5,6,7,8,43,11,10);
//        numbers.forEach(val ->{
//            root.insert(val);
//        });
//
//       // root.printInOrder();
//        printNodes(root);
//
//        sayHelloNUmberTimes(10);





    }



    public static void sayHelloNUmberTimes(int n){
        while(n != 0){
            System.out.println("Say Hello "+ n);
            n --;
        }
    }


    public static void  printNodes(Node root){
        System.out.println(root.data);
        if (root.leftNode != null){
            root.leftNode.printInOrder();
        }
        if (root.rightNode != null){
            root.rightNode.printInOrder();
        }

    }

    public Integer nearestSuccessor(Node root,int val){
        Integer nearestSuccessor = null;
        if (root == null) {
            return nearestSuccessor;
        }
        if (root.data <= val){
            //----> GO to left

        }
        else {


        }

        return nearestSuccessor;


    }
}
