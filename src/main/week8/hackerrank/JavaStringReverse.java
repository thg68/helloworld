import java.io.*;
import java.util.*;

public class Solution {

    public static boolean check(String a) {
        int wrong = 0;
        if(a.length() % 2 == 0) {
            for(int i = 0; i<=a.length()/2; i++) {
                int h = a.length() - 1 - i;
                if(a.charAt(i) != a.charAt(h)) {
                    return false;
                }
            }
        }
        else {
            for(int i = 0; i<(a.length()-1)/2; i++) {
                int h = a.length() - 1 - i;
                if(a.charAt(i) != a.charAt(h)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if(check(A)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }
}



