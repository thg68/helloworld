import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static class Queue<item> {
        private Stack<item> MainUse = new Stack<>();
        private Stack<item> reverse = new Stack<>();

        public void Enqueue(item x) {
            MainUse.push(x);
        }

        public item Dequeue() {
            ReverseStack();
            return reverse.pop();
        }

        public item Peek() {
            ReverseStack();
            return reverse.peek();
        }

        void ReverseStack() {
            if (reverse.empty()) {
                while (!MainUse.empty()) {
                    reverse.push(MainUse.pop());
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue <Integer> x = new Queue<>();
        for(int i = 0;i<n;i++) {
            int request = sc.nextInt();
            switch (request) {
                case 1: { //Enqueue
                    int num = sc.nextInt();
                    x.enqueue(num);
                    break;
                }

                case 2: { //Dequeue
                    x.dequeue();
                    break;
                }

                case 3: { //Peek
                    System.out.println(x.peek());
                    break;
                }
            }
        }
    }

}
