import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.TreeMap;

class MaxHeap {
    public static void main(String[] args) {
        int[] values = {1, 3, 10, 9, 6, 7, 4, 5, 2, 8};
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int value : values) {
            maxHeap.offer(value);
        }
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(0,5);
        treeMap.put(1,8);
        treeMap.put(2,1);
        treeMap.put(3,3);
        System.out.println(treeMap);
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}