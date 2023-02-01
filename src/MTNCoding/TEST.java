package MTNCoding;


import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;




class Elm extends Tree {
    String getName() {
        return "ElM";
    }
}

class Recursive<I> {
    public I func;
}


class Tree extends HashMap<String,Tree>{}

public class TEST {




    public static void  xxx (int a){
        a +=1;
    }

    public static void main(String[] args) {
        LinkedList<Integer> sampleLinkedList = new LinkedList<Integer>();
        sampleLinkedList.add(1);
        sampleLinkedList.add(2);
        sampleLinkedList.add(3);
        sampleLinkedList.add(4);
        System.out.println("Linked List: ->"+sampleLinkedList);
        System.out.println("Reversed Linked List: ->"+reverseLinkedList(sampleLinkedList));
        sampleLinkedList.getFirst();
    }

    static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list){
        LinkedList<Integer> result = new LinkedList<Integer>();
        for (int i = list.size() - 1; i >= 0; i --){
            result.add(list.get(i));
        }
         return result;
    }

    static String reverseString(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String fs = s.substring(0, 1);
        String ls = s.substring(1);
        return reverseString(ls) + fs;

    }

}
