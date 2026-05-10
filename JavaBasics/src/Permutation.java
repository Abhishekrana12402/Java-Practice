import java.util.ArrayList;
import java.util.Collections;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(PermutationProblem("ABSG",""));
    }
    static ArrayList<String> PermutationProblem(String s, String up){
        if(s.isEmpty()){
           ArrayList<String>list=new ArrayList<>();
           list.add(up);
            return list;
        }
        ArrayList<String>outer=new ArrayList<>();
        for (int i=0;i<up.length()+1;i++) {
            String left = up.substring(0, i);
            char ch = s.charAt(0);
            String right = up.substring(i, up.length());

          ArrayList<String>innerlist= PermutationProblem(s.substring(1), left + ch + right);
         outer.addAll(innerlist);
        }
        Collections.sort(outer);
        return outer;
    }
}
