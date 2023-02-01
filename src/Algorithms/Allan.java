package Algorithms;

import java.util.*;

public class Allan {


    public static void main(String[] args) {
////        int x = 10;
////        int n = 0;
////
////        while (n < x){
////            for (int i = 0; i < 5; i++){
////                System.out.println(String.format("Hello X: %s called %s",n,i));
////            }
////            n +=1;
////        }
////        ArrayList<Integer> vals = new ArrayList<>();
////        vals.add(1);
////
////
////        HashMap<String,Integer> map = new HashMap<>();
////        List<String> students = Arrays.asList("A","B","A","C","B");
////        for (String val : students){
////            if (!map.containsKey(val)){
////                map.put(val,1);
////            } else {
////                map.put(val,map.get(val) + 1);
////            }
//        }
//
//        System.out.println(max_valFunc(map));
//
//
        String word = "Wajega./lsoos#";

        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }

        System.out.println(reversed.toString());


    }
    public static int max_valFunc(HashMap<String,Integer> map){
        int max_val = Integer.MIN_VALUE;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if (entry.getValue() > max_val){
                max_val = entry.getValue();
            }
        }
        return max_val;
    }
}
