package Recursion;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(5);
        priorityQueue.add(6);
        ClearQue(priorityQueue);

    }

    public static void ClearQue(PriorityQueue<Integer> priorityQueue){
        System.out.println(priorityQueue.poll());
        if (!priorityQueue.isEmpty()){
            ClearQue(priorityQueue);
        }
    }
}
