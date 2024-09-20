
    public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
        // Write your code here

        List<Integer> dist = new ArrayList<>(Collections.nCopies(n, -1));
        dist.set(s - 1, 0);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            for (List<Integer> edge : edges) {
                int u = edge.get(0);
                int v = edge.get(1);

                if (u == curr && dist.get(v - 1) == -1) {
                    dist.set(v - 1, dist.get(u - 1) + 6);
                    queue.add(v);
                } else if (v == curr && dist.get(u - 1) == -1) {
                    dist.set(u - 1, dist.get(v - 1) + 6);
                    queue.add(u);
                }
            }
        }

        dist.remove(s - 1);

        return dist;
    }
