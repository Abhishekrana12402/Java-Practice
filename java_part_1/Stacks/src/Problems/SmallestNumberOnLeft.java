package Problems;

import javax.swing.text.SimpleAttributeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SmallestNumberOnLeft {
    public static void main(String[] args) {
int n=3;int[] a={1,6,2};
        System.out.println(leftSmaller(n,a));
    }
    static List<Integer> leftSmaller(int n, int a[])
    {
        List<Integer>list=new ArrayList<>();
        //code here
        Stack<Integer>stack=new Stack<>();
        stack.push(-1);
        for(int i=0;i<n;i++){
            while (a[i]<stack.peek()){
                stack.pop();
            }
            int temp=a[i];
            list.add(stack.peek());
            stack.push(temp);
        }

        return list;
    }
}
