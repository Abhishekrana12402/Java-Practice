import java.util.Stack;

public class RemoveSubstring {
    public static void main(String[] args) {
       String s = "aabababa";String part = "aba";
        System.out.println(removeOccurrences(s,part));
    }
    public static String removeOccurrences(String s, String part) {
        Stack<Character>stack=new Stack<>();
        for(char ch:s.toCharArray()){
            stack.push(ch);
            if(stack.size()>=part.length()&&stack.peek()==part.charAt(part.length()-1)){
                Stack<Character>temp=new Stack<>();
                int length=part.length()-1;
                while (length>=0){
                    if(stack.peek()!=part.charAt(length)){
                        break;
                    }
                    temp.push(stack.pop());
                    length--;
                }
                if(temp.size()<part.length()){
                    while (!temp.isEmpty()){
                        stack.push(temp.pop());
                    }
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
