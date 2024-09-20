import java.util.List;
import java.util.Stack;

public class Solution {
    public static int equalStack(List<Integer> h1,List<Integer> h2,List<Integer> h3) {
        int sum1 = 0 , sum2 = 0 , sum3  = 0;
        Stack<Integer> one = new Stack<>();
        Stack<Integer> two = new Stack<>();
        Stack<Integer> three = new Stack<>();

        for(int i = h1.size();i >= 0;i--) {
            sum1 += h1.get(i);
            one.push(sum1);
        }
        for(int i = h2.size();i >= 0;i--) {
            sum2 += h2.get(i);
            two.push(sum2);
        }
        for(int i = h3.size();i >= 0;i--) {
            sum3 += h3.get(i);
            three.push(sum3);
        }
        while (!(one.empty() && two.isEmpty() && three.isEmpty())) {
            if(sum1 == sum2 && sum2 == sum3) {
                return sum1;
            }
            if(sum1 > sum2 || sum1 > sum3) {

                sum1 -= one.pop();
            } else if (sum2 > sum1 || sum2 > sum3) {
                sum2 -= two.pop();
            } else if (sum3 > sum1 || sum3 > sum2 ) {
                sum3 -= three.pop();
            }
        }
        return 0;
    }

}
