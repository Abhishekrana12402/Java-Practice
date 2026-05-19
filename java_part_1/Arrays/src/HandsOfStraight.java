import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HandsOfStraight {
    public static void main(String[] args) {
       int[] nums ={1,2,3,4,6,7,8,9,10,11};
        System.out.println(isPossibleDivide(nums));
    }
    public  static boolean isPossibleDivide(int[] hand) {

        Arrays.sort(hand);
        HashMap<Integer,Integer>map=new HashMap<>();int ans=0;
        for(int num:hand){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int temp=hand[0];
        for(int num:hand){

            if(map.get(num)==0){
                continue;
            }
            int count=1;int n=num;
            while(count<4||(map.get(n)!=null&&map.get(n)>1)){
                if (map.getOrDefault(n, 0) == 0&&count<4) {
                    if(n-count!=temp){
                        return false;
                    }
                    break;
                }
                map.put(n, map.get(n) - 1);

                n=n+1;
                count++;
            }
            temp=n-1;

            System.out.println(temp);
        }

        return true;
    }
}
