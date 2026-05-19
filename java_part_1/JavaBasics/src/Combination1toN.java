import java.util.ArrayList;
import java.util.List;
public class Combination1toN {
    public static void main(String[] args){
        System.out.println(combine(4,2));
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        return Helper(ans,list,1,0,k,n);
    }
    static List<List<Integer>> Helper(List<List<Integer>>ans,List<Integer>list,int start,int j,int k,int n){
if(j==n){
    return ans;
}
if (list.size()==k){
    System.out.println(list);
    ans.add(new ArrayList<>(list));

    return ans;
}
for(int i=start;i<=n;i++){
    list.add(i);
Helper(ans,list,start+1,j,k,n);
list.remove(list.size()-1);
    start+=1;
}
return ans;
    }
}
