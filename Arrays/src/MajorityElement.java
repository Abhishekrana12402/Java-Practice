import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int [] nums={2,2,1,3,1,1,3,1,1};
        int count=0;int element=0;
       for(int i=0;i<nums.length;i++){
           if(count==0){
                element=nums[i];
               count=1;
           } else if (element==nums[i]) {
               count++;
           }
           else {
               count--;
           }
       }
       count=0;
       for(int i=0;i<nums.length;i++){
           if(element==nums[i]){
               count++;
           }
        }
       if(count>nums.length/2){
           System.out.print("Majority Element exists which is "+element);
       }
    }
}
