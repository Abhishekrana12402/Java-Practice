package Problems;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallestNumber
{
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int[] arr={5,8,9,2,7};
        NextSmallest(arr,stack);
    }
    static void NextSmallest(int[] arr,Stack<Integer> stack){
       for(int i=arr.length-1;i>=0;i--){
           while (arr[i]<stack.peek()){
               stack.pop();
           }
           int temp=arr[i];
           arr[i]=stack.peek();
           stack.push(temp);

       }
        System.out.println(Arrays.toString(arr));
    }


}
