package depthFirstSearch;

import java.util.List;
import java.util.Stack;


public class DFS {
    private Stack<Vertex> stack;
    public DFS(Stack<Vertex> stack) {
        this.stack = stack;
    }

    public void dfs(List<Vertex> vertexList){
        for (Vertex v : vertexList){
            if(!v.getVisited()){
                v.setVisited(true);
                dfsWithStackedVertex(v);
            }
        }
    }

    private void dfsWithStackedVertex(Vertex rootVertex) {
        this.stack.add(rootVertex);
        rootVertex.setVisited(true);
        while(!stack.isEmpty()){
            Vertex actualVertex = this.stack.pop();
            System.out.println("actual vertext"+" ");
            for (Vertex v : actualVertex.getNeighborList()){
                if (!v.getVisited()){
                    v.setVisited(true);
                    this.stack.push(v);
                }
            }
        }

    }
}
