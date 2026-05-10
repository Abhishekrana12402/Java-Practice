package Problems;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
       int N = 9; int[] arr = {9,1,8,2,7,3,6,4,5};

        System.out.println(Arrays.toString(nextLargerElement(arr, N)));
    }
    public static int[] nextLargerElement(int[] nums, int n)
    {
        // Your code here
       Stack<Integer>stack =new Stack<>();
       for(int i=2*(n-1);i>=0;i--){
           while (!stack.isEmpty()&&stack.peek()<=nums[i%n]){
               stack.pop();
           }
           if(stack.isEmpty()){
               stack.push(-1);
           }
int temp=nums[i%n];
           nums[i%n]=stack.peek();
               stack.push(temp);
       }
       while (!stack.isEmpty()){
           stack.pop();
       }
       return nums;
    }

}
