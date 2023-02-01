package Andela;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Bull {

    public static void main(String[] args) {
        try {
            List<Integer> numbers = Arrays.asList(0, 2, 3, 1, 5, 2, 13);
            BTNode root = new BTNode(numbers.get(0));
            AtomicInteger x = new AtomicInteger();
            numbers.stream().forEach(i -> {
                if (x.intValue() > 0) {
                    root.insert(i);
                }
                x.incrementAndGet();
            });

            root.printInOrder();
            root.printLeftNodes();
            System.out.println("total Left"+root.total);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}

class BTNode {
    int input;
    BTNode left, right;

    int total=0;

    BTNode(int a) {
        input = a;
    }

    public void insert(int data) {
        BTNode node = new BTNode(data);

        if (data <= input) {
            if (left == null) {
                left = node;
            } else {
                left.insert(data);
            }
        } else {
            if (right == null) {
                right = node;
            } else {
                right.insert(data);
            }
        }

    }

    public void printInOrder() { /// LEFT PARENT RIGHT
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(input);

        if (right != null) {
            right.printInOrder();
        }
    }

    public void printLeftNodes(){
        if(right!=null){
            total+=right.input;
            right.printLeftNodes();
        }

        if(left!=null){
            total+=left.right!=null?left.right.input:0;
            left.printLeftNodes();
        }
    }

}
