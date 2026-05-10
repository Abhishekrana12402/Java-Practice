import java.util.ArrayList;
import java.util.List;

class DiceProblem{
    public static void main(String[] args) {

        System.out.println(Dice("",4));

    }
   static List<String> Dice(String up,int target){
        if (target==0){
            List<String>list=new ArrayList<>();
            list.add(up);
            return list ;
        }
        List<String>ans=new ArrayList<>();
        for (int i=1;i<=target;i++){
             ans.addAll(Dice(up+i,target-i));
        }
        return ans;
   }
}