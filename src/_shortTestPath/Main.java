package _shortTestPath;

import javafx.scene.layout.Priority;
import javafx.util.Pair;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int a,b,c;
        b =10;
        a =b =c =20;

//
//        String sample = "HelloWord";
//        List<String> splitStrings = Arrays.asList(sample.split("Hello"));
//
//        System.out.println(Arrays.asList(sample.split("dsdsdsd")).size());


//
//        String s = "High|thhtht";
//        List<String> result = Arrays.asList(s.split("\\|"));
//        System.out.println(result);

 StringBuilder sb = new StringBuilder("ABCD");
 sb.replace(1,3,"C").insert(4,"Q");
        System.out.println(sb);


    }
    public static int getCheapestCost(Node rootNode){
        //--------> if the root node is null
        if (rootNode == null){
            return 0;
        }
        int minCost = Integer.MAX_VALUE;
        PriorityQueue<Pair<Node, Integer>> q = new PriorityQueue<>();
        q.add(new Pair<>(rootNode,0));

        while(!q.isEmpty()){
        Pair<Node,Integer> current = q.poll();
        Node node = current.getKey();
        int current_cost = current.getValue() + node.cost;

        //---------> if its a leaf node
            if (node.children == null){
              minCost = Math.min(minCost, current_cost);
            } else {

                for(Node n : node.children){
                    q.add(new Pair<>(n,current_cost));
                }

            }


        }


    return minCost;

    }



}
