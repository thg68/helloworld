
class Result {

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int findMedian(List<Integer> arr) {
        int n = arr.size();
        return findMedianUtil(arr, 0, n - 1, (n - 1) / 2);
    }

    private static int findMedianUtil(List<Integer> arr, int low, int high, int k) {
        if (low <= high) {
            int pivotIndex = randomPartition(arr, low, high);
            if (pivotIndex == k) {
                return arr.get(pivotIndex);
            }
            if (pivotIndex > k) {
                return findMedianUtil(arr, low, pivotIndex - 1, k);
            }
            return findMedianUtil(arr, pivotIndex + 1, high, k);
        }
        return Integer.MIN_VALUE;
    }

    private static int randomPartition(List<Integer> arr, int low, int high) {
        int randomIndex = new Random().nextInt(high - low + 1) + low;
        swap(arr, randomIndex, high);

        int pivot = arr.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr.get(j) <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

}



