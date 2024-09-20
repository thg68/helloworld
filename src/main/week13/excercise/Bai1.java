import java.util.*;

class Graph {
    private Map<Character, Map<Character, Integer>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addEdge(char source, char destination, int weight) {
        adjacencyList.computeIfAbsent(source, k -> new HashMap<>()).put(destination, weight);
        adjacencyList.computeIfAbsent(destination, k -> new HashMap<>()).put(source, weight);
    }

    public void printGraph() {
        for (char vertex : adjacencyList.keySet()) {
            System.out.print(vertex + " -- ");
            for (Map.Entry<Character, Integer> edge : adjacencyList.get(vertex).entrySet()) {
                System.out.print(edge.getKey() + "(" + edge.getValue() + ") ");
            }
            System.out.println();
        }
    }

    // Prim's Algorithm
    public Set<Character> primMST(char startVertex) {
        Set<Character> mst = new HashSet<>();
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(edge -> edge.weight));

        mst.add(startVertex);
        while (mst.size() < adjacencyList.size()) {
            for (Map.Entry<Character, Integer> neighbor : adjacencyList.get(startVertex).entrySet()) {
                char destination = neighbor.getKey();
                int weight = neighbor.getValue();
                if (!mst.contains(destination)) {
                    priorityQueue.add(new Edge(startVertex, destination, weight));
                }
            }

            Edge minEdge = priorityQueue.poll();
            assert minEdge != null;
            startVertex = minEdge.destination;
            mst.add(startVertex);
        }

        return mst;
    }

    // Kruskal's Algorithm
    public Set<Character> kruskalMST() {
        Set<Character> mst = new HashSet<>();
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(edge -> edge.weight));

        for (char vertex : adjacencyList.keySet()) {
            for (Map.Entry<Character, Integer> neighbor : adjacencyList.get(vertex).entrySet()) {
                char destination = neighbor.getKey();
                int weight = neighbor.getValue();
                priorityQueue.add(new Edge(vertex, destination, weight));
            }
        }

        while (mst.size() < adjacencyList.size()) {
            Edge minEdge = priorityQueue.poll();
            assert minEdge != null;
            char source = minEdge.source;
            char destination = minEdge.destination;

            if (!(mst.contains(source) && mst.contains(destination))) {
                mst.add(source);
                mst.add(destination);
            }
        }

        return mst;
    }

    // Dijkstra's Algorithm
    public Map<Character, Integer> dijkstra(char startVertex) {
        Map<Character, Integer> distances = new HashMap<>();
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(node -> node.distance));

        distances.put(startVertex, 0);
        priorityQueue.add(new Node(startVertex, 0));

        while (!priorityQueue.isEmpty()) {
            char currentVertex = priorityQueue.poll().vertex;

            for (Map.Entry<Character, Integer> neighbor : adjacencyList.get(currentVertex).entrySet()) {
                char destination = neighbor.getKey();
                int weight = neighbor.getValue();

                int newDistance = distances.get(currentVertex) + weight;

                if (!distances.containsKey(destination) || newDistance < distances.get(destination)) {
                    distances.put(destination, newDistance);
                    priorityQueue.add(new Node(destination, newDistance));
                }
            }
        }

        return distances;
    }

    private static class Edge {
        char source;
        char destination;
        int weight;

        Edge(char source, char destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    private static class Node {
        char vertex;
        int distance;

        Node(char vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addEdge('A', 'B', 7);
        graph.addEdge('A', 'C', 6);
        graph.addEdge('A', 'D', 9);
        graph.addEdge('B', 'C', 2);
        graph.addEdge('B', 'E', 5);
        graph.addEdge('B', 'F', 10);
        graph.addEdge('C', 'D', 12);
        graph.addEdge('C', 'G', 1);
        graph.addEdge('D', 'G', 14);
        graph.addEdge('D', 'H', 20);
        graph.addEdge('E', 'F', 4);
        graph.addEdge('E', 'H', 13);
        graph.addEdge('F', 'G', 3);
        graph.addEdge('F', 'H', 8);
        graph.addEdge('G', 'H', 16);

        System.out.println("a. Đồ thị:");
        graph.printGraph();

        System.out.println("\nb.Prim's Algorithm:");
        Set<Character> primMST = graph.primMST('A');
        System.out.println(primMST);

        System.out.println("\nc.Kruskal's Algorithm:");
        Set<Character> kruskalMST = graph.kruskalMST();
        System.out.println(kruskalMST);

        System.out.println("\nd.Dijkstra's Algorithm:");
        Map<Character, Integer> dijkstraResult = graph.dijkstra('A');
        System.out.println(dijkstraResult.get('H'));
    }
}
