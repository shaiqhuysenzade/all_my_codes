package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class XGraph {
    private final int vertex_count;
    private final List<LinkedList<Integer>> edges;

    public XGraph(int count) {
        this.vertex_count = count;
        this.edges = IntStream.range(0, vertex_count)
                .mapToObj(n -> new LinkedList<Integer>())
                .collect(Collectors.toList());
        //if final field change to ArrayList
//        this.edges = IntStream.range(0, vertex_count)
//                .mapToObj(n->new LinkedList<Integer>())
//                .collect(Collectors.toCollection(ArrayList::new));
    }

    public void add(int vertex_from, int vertex_to) {
        edges.get(vertex_from).add(vertex_to);
    }

    public void remove(int vertex_from, int vertex_to) {
        edges.get(vertex_from).remove(Integer.valueOf(vertex_to)); // manual boxing
    }

    public boolean check(int vertex_from, Integer vertex_to) {
        List<Integer> vertices_To = edges.get(vertex_from);
        return vertices_To.contains(vertex_to);
    }

    public int getVertexCount() {
        return vertex_count;
    }
    public LinkedList<Integer> getEdgesFrom(int vertex_from){
//        LinkedList<Integer> destination = edges.get(vertex_from);
//        return  destination;
        return  edges.get(vertex_from);
    }
}
