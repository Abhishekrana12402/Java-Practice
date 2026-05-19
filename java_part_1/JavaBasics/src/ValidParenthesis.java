import java.util.ArrayList;
import java.util.HexFormat;
import java.util.List;
public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
 Helper(n,0,0,ans,"");
 return ans;
    }
    static void Helper(int n,int open,int close,List<String>ans,String s){
        if(close==n){
            ans.add(s);
            return;
        }
        if (open<n){
          Helper(n,open+1,close,ans,s+"(");
        }
        if(open>close){
            Helper(n,open,close+1,ans,s+")");
        }
    }

}
