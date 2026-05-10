import java.time.temporal.JulianFields;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class practice2 {
    static List<String> RemoveCommonSub(List<String>expressions){
        List<String>opt=new ArrayList<>();
        Map<String,String>Map1=new HashMap<>();
        for( String exp:expressions ){
            String[] parts=exp.split("=");
            String lhs=parts[0].trim();
            String rhs=parts[1].trim();
            if(Map1.containsValue(rhs)){
              for (Map.Entry<String,String> temp:Map1.entrySet()){
                  if (temp.getValue().equals(rhs)){
                      String temp2=temp.getKey();
                      exp=exp.replace(rhs,temp2);
                  }
              }
            }
            else {
                Map1.put(lhs,rhs);
            }
            opt.add(exp);
        }
        return opt;
    }
    static List<String> AlgSimplifications(List<String>expns){
        List<String>algsimp=new ArrayList<>();
        for (String temp:expns){
           temp= temp.replace("+0","");
           temp=temp.replace("*1","");
           algsimp.add(temp);
        }
        return algsimp;
    }
    public static void main(String[] args) {
        List<String>expn=new ArrayList<>();
        expn.add("x=a+b");
        expn.add("y=b*1");
        expn.add("z=a+b");
        expn.add("w=x+0");
        List<String> elim=RemoveCommonSub(expn);
        List<String> Alg=AlgSimplifications(elim);
        System.out.println(elim);
        System.out.println(Alg);
    }
}
