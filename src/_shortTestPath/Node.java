package _shortTestPath;


public class Node {
    int cost;
    Node[] children;
    Node parent;

    Node(int cost) {
        this.cost = cost;
        children = null;
        parent = null;
    }

}
