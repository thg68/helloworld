import java.util.Scanner;
import java.util.Random;
public class SelectionSort {
    public static void sort(int[] a) {
        int n = a.length;
        int index = 0;
        for (int i = 0;i<n;i++) {
            int minn = a[i];
            for(int j = i;j<n;j++) {
                if(a[j] < minn) {
                    minn = a[j];
                    index = j;
                }
            }
            if(a[i] > minn) {
                int tmp = a[i];
                a[i] = a[index];
                a[index] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner neww = new Scanner(System.in);
        Random rd = new Random();
        int N = neww.nextInt();
        int[] a = new int[N];

        for (int i = N-1; i >= 0; i--) {
            a[i] =  rd.nextInt(100);
        }

        sort(a);

        for (int i = 0; i < N; i++) {
            System.out.println(a[i]);
        }
    }

}
