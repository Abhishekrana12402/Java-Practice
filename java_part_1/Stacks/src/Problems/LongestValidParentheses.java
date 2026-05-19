package Problems;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String s = "()()";
        System.out.println(longestValidParentheses(s));
    }

    public static int longestValidParentheses(String s) {
        int length = 0;
        Stack<Integer> stack = new Stack<>();
stack.push(-1);
for(int i=0;i<s.length();i++){
   if(s.charAt(i)=='('){
       stack.push(i);
   }
   else {
       stack.pop();
       if(stack.isEmpty()){
           stack.push(i);
       }
       else {
           length=Math.max(length,i-stack.peek());
       }
   }
}
        return length;
    }
}
