public static List<Double> runningMedian(List<Integer> a) {
        List<Double> medians = new ArrayList<>();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : a) {
        addNumber(num, maxHeap, minHeap);
        balanceHeaps(maxHeap, minHeap);
        medians.add(findMedian(maxHeap, minHeap));
        }

        return medians;
        }

private static void addNumber(int num, PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
        maxHeap.add(num);
        } else {
        minHeap.add(num);
        }
        }

private static void balanceHeaps(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
        while (maxHeap.size() > minHeap.size() + 1) {
        minHeap.add(maxHeap.poll());
        }
        while (minHeap.size() > maxHeap.size()) {
        maxHeap.add(minHeap.poll());
        }
        }

private static double findMedian(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
        if (maxHeap.size() == minHeap.size()) {
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
        return maxHeap.peek();
        }
        }