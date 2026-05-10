package Problems;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        long[] hist={2,1,5,6,2,3,1};
        System.out.println(largestRectangleArea(hist,hist.length));
    }
    public  static long largestRectangleArea(long[] hist,long n) {
 long max=Integer.MIN_VALUE;
long[] LeftSmall=new long[hist.length];
long[] RightSmall=new long[hist.length];
        Stack<Long>stack=new Stack<>();
        for(long i=0;i<n;i++){
            while (!stack.isEmpty()&&hist[Math.toIntExact(stack.peek())]>=hist[(int) i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                LeftSmall[(int) i]=0;
            }
            else {
                LeftSmall[(int) i] = stack.peek() + 1;
            }
                stack.push(i);

        }
        while (!stack.isEmpty()){
            stack.pop();
        }
        for(long i=n-1;i>=0;i--){
            while (!stack.isEmpty()&&hist[Math.toIntExact(stack.peek())]>=hist[(int) i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                RightSmall[(int) i]=n-1;
            }
            else {
                RightSmall[(int) i] = stack.peek() - 1;
            }
            stack.push(i);
        }
for (int i=0;i<n;i++){
    long area=(RightSmall[i]-LeftSmall[i]+1)*hist[i];
    if(area>max){
        max=area;
    }
}
//        System.out.println(Arrays.toString(LeftSmall));
//        System.out.println(Arrays.toString(RightSmall));
        return max;
    }
}
