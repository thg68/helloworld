import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> closestNumbers(List<Integer> arr) {
        if (arr == null || arr.size() < 2) {
            return new ArrayList<>();
        }

        mergeSort(arr, 0, arr.size() - 1);

        int minDifference = Integer.MAX_VALUE;
        List<Integer> closestNumbers = new ArrayList<>();

        for (int i = 1; i < arr.size(); i++) {
            int currentDifference = arr.get(i) - arr.get(i - 1);

            if (currentDifference < minDifference) {
                minDifference = currentDifference;
                closestNumbers.clear();
                closestNumbers.add(arr.get(i - 1));
                closestNumbers.add(arr.get(i));
            } else if (currentDifference == minDifference) {

                closestNumbers.add(arr.get(i - 1));
                closestNumbers.add(arr.get(i));
            }
        }

        return closestNumbers;
    }

    private static void mergeSort(List<Integer> arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(List<Integer> arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        List<Integer> leftArr = new ArrayList<>(arr.subList(left, left + n1));
        List<Integer> rightArr = new ArrayList<>(arr.subList(mid + 1, mid + 1 + n2));

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr.get(i) <= rightArr.get(j)) {
                arr.set(k, leftArr.get(i));
                i++;
            } else {
                arr.set(k, rightArr.get(j));
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr.set(k, leftArr.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            arr.set(k, rightArr.get(j));
            j++;
            k++;
        }
    }
}
