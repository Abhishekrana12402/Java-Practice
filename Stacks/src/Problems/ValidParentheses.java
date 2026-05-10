package Problems;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s="()";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
       /* Stack<Integer>stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            int a=Math.abs(s.charAt(i)+0);

            if(!stack.isEmpty()&& ((a-stack.peek())==1||(a-stack.peek())==2)){
                stack.pop();
            }else {
                stack.push(a);
            }
        }
        if(stack.isEmpty()){
            return true;
        }
return false;

        */
        Stack<Character>stack=new Stack<>();
        char[] ch=(s.toCharArray());
       for(int i=0;i<s.length();i++){
           char c=ch[i];
           if(c=='('||c=='{'||c=='['){
               stack.push(c);
           }
           else{
               if(c==')'&&stack.peek()=='('&&!stack.isEmpty()){
                   stack.pop();
               }
               if(c==']'&&stack.peek()=='['&&!stack.isEmpty()){
                   stack.pop();
               }
               if(c=='}'&&stack.peek()=='{'&&!stack.isEmpty()){
                   stack.pop();
               }
           }
       }

        return stack.isEmpty();
    }


}
