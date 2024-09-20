import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == x) {
                return m + 1;
            }

            else if (arr[m] < x) {
                l = m + 1;
            }

            else {
                r = m - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<n ; i++) {
            arr[i] = rd.nextInt(100);
        }
        Arrays.sort(arr);

        System.out.println(binarySearch(arr, x));
    }
}
