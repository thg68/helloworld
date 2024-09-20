import java.util.*;
public class hong{

    public static int partition(List<Integer>list, int lo, int hi){
        int pivot = list.get(lo);
        int j = lo;
        for(int i = j+1; i <=hi; i++){
            if(list.get(i) < pivot){
                list.add(j , list.get(i));
                list.remove(i+1);
                j++;
            }
        }
        return j;
    }

    public static void quickSort(List<Integer> list, int lo, int hi) {
        if(lo<hi) {
            int j = partition(list, lo, hi);
            quickSort(list, lo, j - 1);
            quickSort(list, j + 1, hi);
            printArray(list, lo, hi);
        }
    }

    static void printArray(List<Integer> list, int lo, int hi) {
        for(int i = lo; i<=hi; i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> arr = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            arr.add(in.nextInt());
        }
        quickSort(arr,0,n-1);
    }
}
