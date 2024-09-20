import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordsCount {
    public static void CountWord(String arr) {
        String[] a = arr.split(" ");
        Arrays.sort(a);
        int count = 1;
        for(int i = 1; i<arr.length();i++) {
            if(a[i].equals(a[i-1])) {
                count++;
            } else {
                StdOut.println(" ' " + a[i-1] + " '" + " xuất hiện : " + count);
                count = 1;
            }
        }
        StdOut.println(" ' " + a[a.length - 1] + " '" + " xuất hiện : " + count);
    }

    public static void main(String[] args) {
        String a = "Hôm qua em tới trường trường học thật sự rất vui em rất thích tới trường";
        String[] arr = a.split(" ");
        Arrays.sort(arr);
        for(int i = 0; i < arr.length;i++) {
            StdOut.println(arr[i]);
        }
        List<Integer> c = new ArrayList<>();
        CountWord(a);
    }
}