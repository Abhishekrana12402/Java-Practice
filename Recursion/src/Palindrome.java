import java.util.List;
import java.util.ArrayList;
public class Palindrome {
    public static void main(String[] args) {
String s=("aab");
        StringBuilder sb=new StringBuilder();
        Helper(sb,s);
    }

       static void Helper(StringBuilder sb,String str){
            if(str.length()==0){
                System.out.println(sb);
                return;
            }
            for(int i=1;i<=str.length();i++){
                if(!Palindrome(str.substring(0,i))){
                    continue;
                }
                sb.append(str.substring(0,i));
                Helper(sb,str.substring(i));
                sb.deleteCharAt(sb.length()-1);
            }
        }
      static   boolean Palindrome(String s){
            int start=0;
            int end=s.length()-1;
            while(start<=end){
                if(s.charAt(start)!=s.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
            return true;

        }
    }

