
    public static int prims(int n, List<List<Integer>> edges, int start) {
        // Write your code here
        List<List<int[]>> graph = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (List<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            int weight = edge.get(2);
            graph.get(u).add(new int[]{v, weight});
            graph.get(v).add(new int[]{u, weight});
        }

        int totalWeight = 0;
        boolean[] visited = new boolean[n + 1];

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        priorityQueue.add(new int[]{start, 0});

        while (!priorityQueue.isEmpty()) {
            int[] current = priorityQueue.poll();
            int u = current[0];
            int weight = current[1];

            if (!visited[u]) {
                totalWeight += weight;
                visited[u] = true;

                for (int[] neighbor : graph.get(u)) {
                    int v = neighbor[0];
                    int edgeWeight = neighbor[1];
                    if (!visited[v]) {
                        priorityQueue.add(new int[]{v, edgeWeight});
                    }
                }
            }
        }
        return totalWeight;
    }


