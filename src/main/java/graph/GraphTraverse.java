package graph;

import java.util.*;

public class GraphTraverse {
    private final XGraph graph;


    public GraphTraverse(XGraph graph) {
        this.graph = graph;
    }

    public Collection<Integer> unordered() {
        Set<Integer> outcome = new HashSet<>();
        for (int v = 0; v < graph.getVertexCount(); v++) {
            if(v==0){
                outcome.add(v);
            }
            LinkedList<Integer> edgesFrom = graph.getEdgesFrom(v);
            outcome.addAll(edgesFrom);
        }
        return outcome;
    }

    public List<Integer> bfs(Integer from) {
        LinkedList<Integer> outcome = new LinkedList<>();
        boolean[] visited_ = new boolean[graph.getVertexCount()];
        LinkedList<Integer> process_ = new LinkedList<>();
        visited_[from] = true;
        process_.add(from);
        while (!process_.isEmpty()) {
            int current = process_.poll();
            outcome.add(current);
            Collection<Integer> children = graph.getEdgesFrom(current);
            for (int to : children) {
                if (visited_[to]) continue;
                visited_[to] = true;
                process_.add(to);
            }
        }
        return outcome;
    }

    public Collection<Integer> dfs(Integer from) {
        return dfs(from,
                new boolean[graph.getVertexCount()],
                new LinkedList<>());
    }

    public Collection<Integer> dfs(Integer from, boolean visited[], Collection<Integer> outcome) {
        if (visited[from]) return outcome;
        visited[from] = true;
        outcome.add(from);
        Collection<Integer> children = graph.getEdgesFrom(from);
        for (int to : children) {
            dfs(to, visited, outcome);
        }
        return outcome;
    }
}
