package InorderSuccessor;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    static class Node {

        int key;
        Node left;
        Node right;
        Node parent;

        Node(int key) {
            this.key = key;
            left = null;
            right = null;
            parent = null;
        }
    }

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("Allan",20);
        map.put("Mark",40);
        map.put("Steve",50);
        map.put("Harrient",90);
        map.put("Goerge",30);
        System.out.println(map);

        System.out.println("Sorted Map: -->"+map.entrySet().stream().sorted((entry1,entry2) -> entry2.getValue() - entry1.getValue()).collect(Collectors.toList()));

    }

    Node root;
    Node findInOrderSuccessor(Node inputNode) {
        // your code goes here
        if (root == null || inputNode == null){
            return null;
        }
        Node successor = null;
        while (root !=null){
            if (inputNode.key >= root.key){
                root = root.right;
                }
            else {
                successor = root;
                root = root.left;
            }
        }
        return successor;
    }
}
