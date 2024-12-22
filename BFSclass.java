
package bfsexamples;


    import java.util.*;

public class BFSclass {

    static class Graph {
        Map<String, List<String>> adjList = new HashMap<>();

        public void addEdge(String source, String destination) {
            adjList.putIfAbsent(source, new ArrayList<>());
            adjList.putIfAbsent(destination, new ArrayList<>());
            adjList.get(source).add(destination);
        }

        public void bfs(String start) {
            Queue<String> queue = new LinkedList<>();
            Set<String> visited = new HashSet<>();

            queue.add(start);
            visited.add(start);

            while (!queue.isEmpty()) {
                String current = queue.poll();
                System.out.print(current + " ");

                for (String neighbor : adjList.get(current)) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
        }
    }
}


