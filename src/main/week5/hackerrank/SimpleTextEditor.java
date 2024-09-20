import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a = "";
        int n = sc.nextInt();
        Stack<String> save = new Stack<>();

        for (int i = 0; i <n;i++) {
            int request = sc.nextInt();
            switch (request) {
                case 1 : { // append
                    save.push(a);
                    a += sc.next();
                    break;
                }

                case 2: { //delete
                    save.push(a);
                    int num = sc.nextInt();
                    String neww = a.substring(0,a.length() - num);
                    a = neww;
                    break;
                }

                case 3: {//print
                    int num = sc.nextInt();
                    System.out.println(a.charAt(num-1));
                    break;
                }

                case 4: { //undo
                    if(!save.isEmpty()) {
                        a = save.pop();
                    }
                    break;
                }
            }
        }
    }
}