package Problems;

import java.util.Stack;

public class MinimumInsertionToBalance {
    public static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count1 = 0;
        char ch[] = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            char c = ch[i];
            if (c == ')') {
                if (!stack.isEmpty() && ch[i + 1] == ')' && stack.peek() == '(') {
                    stack.pop();
                    i += 2;
                }
            }
            if (i <= s.length() - 1) {
                stack.push(ch[i]);
            }
        }
        System.out.println(stack);
        if (stack.isEmpty()) {
            return 0;
        }
        while (!stack.isEmpty()){
            char a=stack.pop();
            char b=stack.pop();
            if(a==b){
                if(a=='('){

                }
            }
        }
        return stack.elementAt(1);
    }

    public static void main(String[] args) {
        String s="))(())(";

        System.out.println(minInsertions(s));
    }
}
