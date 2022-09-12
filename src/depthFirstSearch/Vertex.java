package depthFirstSearch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vertex {
    private String name;
    private Boolean visited;
    private List<Vertex> neighborList;
    Vertex(String name){
        this.name = name;
        this.neighborList = new ArrayList<>();
    }

    public void addneighbor(Vertex v1){
        this.neighborList.add(v1);
    }



}
