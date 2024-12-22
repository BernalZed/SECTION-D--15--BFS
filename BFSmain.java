
package bfsexamples;

public class BFSmain {

    public static void main(String[] args) {
        BFSclass.Graph graph = new BFSclass.Graph();

        // Add edges based on the graph structure
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "E");
        graph.addEdge("C", "F");

        // Perform BFS starting from node "A"
        System.out.println("Breadth-First Search starting from A:");
        graph.bfs("A");
    }
}

 