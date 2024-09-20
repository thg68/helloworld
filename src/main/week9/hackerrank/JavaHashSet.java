import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Set<String> people = new HashSet<>();
        int n = sc.nextInt();
        String [] pair_left = new String[n];
        String [] pair_right = new String[n];
        for (int i = 0; i < n; i++) {
            pair_left[i] = sc.next();
            pair_right[i] = sc.next();
        }
        for(int i = 0;i<n;i++) {
            people.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(people.size());
        }
    }
}
