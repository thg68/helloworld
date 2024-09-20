import java.util.*;

public class Bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số cần tìm: " );
        int k = scanner.nextInt();
        System.out.println("Độ dài mảng: " );
        int n = scanner.nextInt();
        System.out.println("Mảng: " );
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Hashtable<Integer, Integer> nums = new Hashtable<>();
        System.out.println("Các cặp số có tổng bằng " + k + ":");
        for (int i = arr.length - 1; i >= 0; i--) {
            int j = k - arr[i];

            if (nums.containsKey(j)) {
                System.out.print("(" + arr[i] + " " + j + ") ");
            }
            nums.put(arr[i], i);
        }
    }
}
