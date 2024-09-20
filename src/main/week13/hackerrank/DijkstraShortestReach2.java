private static class Node implements Comparable<Node> {
    int index;
    long distance;

    public Node(int index, long distance) {
        this.index = index;
        this.distance = distance;
    }

    @Override
    public int compareTo(Node other) {
        return Long.compare(this.distance, other.distance);
    }
}

    public static List<Integer> shortestReach(int n, List<List<Integer>> edges, int s) {
        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Node>());
        }

        for (List<Integer> edge : edges) {
            int u = edge.get(0) - 1;
            int v = edge.get(1) - 1;
            int w = edge.get(2);
            graph.get(u).add(new Node(v, w));
            graph.get(v).add(new Node(u, w));
        }

        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[s - 1] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(s - 1, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            for (Node neighbor : graph.get(node.index)) {
                long newDist = dist[node.index] + neighbor.distance;
                if (newDist < dist[neighbor.index]) {
                    pq.offer(new Node(neighbor.index, newDist));
                    dist[neighbor.index] = newDist;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < dist.length; i++) {
            if (i != s - 1) {
                if (dist[i] == Long.MAX_VALUE) {
                    result.add(-1);
                } else {
                    result.add((int) dist[i]);
                }
            }
        }
        return result;
    }
