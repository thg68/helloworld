import edu.princeton.cs.algs4.*;
import java.util.*;

public class Sum3 {
    public static void main(String[] args) {
        In in = new In("C:\\Users\\ADMIN\\Documents\\CTDLGT\\algs4-data\\1Kints.txt");
        int[] a = in.readAllInts();
        Arrays.sort(a);
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int l = i + 1 , r = n-1;
            while(l < r) {
                int total = a[i] + a[l] + a[r];
                if(total== 0) {
                    System.out.println(a[i] + " " + a[l] + " " + a[r]);
                    l++;
                    r--;
                }
                else if (total < 0) l ++;
                else r -- ;
            }
        }
        
    }
}

