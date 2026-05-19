import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class nthPermutation {
    public static void main(String[] args) {
        System.out.println(getPermutation(9,135401));
    }
    public static String getPermutation(int n, int k) {
        String s="";
for (int i=1;i<=n;i++){
    s+=i;
}
List<String>ans=Helper(n,k,s,"");
        System.out.println(ans);
return ans.get(k-1);
    }
    static List<String> Helper (int n, int k, String s, String ans){
        if(s.isEmpty()){
           List<String>list=new ArrayList<>();
           list.add(ans);
           return list;
        }
        List<String>list=new ArrayList<>();
    for (int i=0;i<=ans.length();i++){
        String first=ans.substring(0,i);
        char ch=s.charAt(0);
        String second=ans.substring(i,ans.length());
       list.addAll(Helper(n,k,s.substring(1),second+ch+first));
    }
        Collections.sort(list);
    return list;
    }
}
