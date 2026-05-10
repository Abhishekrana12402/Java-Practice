import java.util.*;
public class Strings_Stacks {

        public static boolean isValid(String s) {
//
            Stack<Character>stack=new Stack<>();
            char[] ch=(s.toCharArray());
            for(int i=0;i<s.length();i++){
                char c=ch[i];
                if(c=='('||c=='{'||c=='['){
                    stack.push(c);
                }
                else{
                    if(c==')'){
                        if(stack.isEmpty()||stack.pop()!='('){
                            return false;
                        }
                    }
                    if(c==']'){
                        if(stack.isEmpty()||stack.pop()!='['){
                            return false;
                        }
                    }
                    if(c=='}'){
                        if(stack.isEmpty()||stack.pop()!='{'){
                            return false;
                        }
                    }
                }
            }

            return stack.isEmpty();
        }

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input =in.nextLine();
        System.out.println(isValid(input));
    }
    }

