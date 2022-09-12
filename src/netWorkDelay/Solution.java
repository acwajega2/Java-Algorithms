package netWorkDelay;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[][] graph = new int[][]{{1,2,3},{2,3,5},{3,4,8}};
        System.out.println(netWorkDelayTime(graph,3,2));
    }



    public static int netWorkDelayTime(int[][] times, int n, int k){
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] time : times){
            int src = time[0], tar = time[1], weight = time[2];
            if (!graph.containsKey(src)){
                graph.put(src, new LinkedList<>());
            }
            graph.get(src).add(new int[]{tar, weight});
        }
        //--------> Define min heap statistics
        Queue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        //----> Define a has set to keep track of visited nodes
        Set<Integer> visitedNodes = new HashSet<>();
        minHeap.add(new int[]{k,0});
        int res = 0;

        //---------> Perfomr BFS algorithm
        while(!minHeap.isEmpty()){
            int[] top = minHeap.poll();
            int src = top[0], srcWeight = top[1];
            if(visitedNodes.contains(src)) continue;
            res = srcWeight;
            visitedNodes.add(src);
            if(!graph.containsKey(src)) continue;
            for(int[] edge : graph.get(src)){
                int tar = edge[0], targetWeight = edge[1];
                minHeap.add(new int[]{tar, srcWeight + targetWeight});
            }
        }
        return visitedNodes.size() == n ? res : -1;
    }
}
