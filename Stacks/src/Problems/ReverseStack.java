package Problems;

import java.net.Inet4Address;
import java.util.Collections;
import java.util.Stack;

public class ReverseStack {

    static void reverse(Stack<Integer> s) {
        // add your code here
        if(s.isEmpty()){
            return;
        }
        int element=s.peek();
        s.pop();
        reverse(s);
        InsertAtBottom(s,element);
    }
    public static void InsertAtBottom(Stack<Integer>s,int element){
        if(s.isEmpty()){
            s.push(element);
            return;
        }
        int top_element=s.peek();
        s.pop();
        InsertAtBottom(s,element);
        s.push(top_element);
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(8);
        stack.push(6);
        stack.push(8);
        stack.push(9);
        stack.push(3);
        stack.push(1);
        stack.push(3);
        stack.push(9);
        stack.push(6);
        stack.push(8);
        reverse(stack);
        System.out.println(stack);
    }
}
