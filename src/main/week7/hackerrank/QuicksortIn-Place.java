import java.util.*;
public class QuicksortIn-Place{

    static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[hi];
        int j = lo;
        for (int i = lo; i < hi; i++) {
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        int temp = arr[j];
        arr[j] = arr[hi];
        arr[hi] = temp;
        printArray(arr);
        return j;
    }

    public static void quickSort(int[] arr, int lo, int hi) {
        if(lo < hi) {
            int index = partition(arr, lo, hi);
            quickSort(arr, lo, index - 1);
            quickSort(arr, index + 1, hi);

        }
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        quickSort(arr,0,n-1);

    }

}
