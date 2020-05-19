package graph;

public class XGraphApp {
    public static void main(String[] args) {
        XGraph graph = new XGraph(17);
        graph.add(0, 1);

        graph.add(1, 2);
        graph.add(1, 3);

        graph.add(2, 4);
        graph.add(2, 5);

        graph.add(4, 8);
        graph.add(4, 9);

        graph.add(5, 10);
        graph.add(5, 11);

        graph.add(3, 6);
        graph.add(3, 7);

        graph.add(6, 12);

        graph.add(7, 13);
        graph.add(7, 14);

        graph.add(12, 15);

        // cycle - will produce stack overflow in Graph.isConnectedBasic(from, to)
        graph.add(6, 16);
        graph.add(16, 3);

        GraphTraverse graphTraverse = new GraphTraverse(graph);
        System.out.printf("Unordered: %s\n" ,graphTraverse.unordered());
        System.out.printf("BFS: %s\n",graphTraverse.bfs(0));
        System.out.printf("DFS: %s\n",graphTraverse.dfs(0));
    }

}
