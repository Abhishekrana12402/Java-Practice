import java.util.*;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
       List<List<Integer>>list=new ArrayList<>();
//       Set<List<Integer>> set=new HashSet<>();
//       for(int i=0;i<nums.length;i++){
//           Set<Integer> set1 =new HashSet<>();
//           for(int j=i+1;j<nums.length;j++){
//               int third=-(nums[i]+nums[j]);
//               if(set1.contains(third)){
//                   List<Integer>temp=new ArrayList<>();
//                   temp.add(nums[i]);
//                   temp.add(nums[j]);
//                   temp.add(third);
//                   Collections.sort(temp);
//                   set.add(temp);
//               }
//               set1.add(nums[j]);
//           }
//       }
//       list.addAll(set);
//        System.out.println(list);
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                } else if (sum>0) {
                    k--;
                }
                else {
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(nums[i]);
                    list1.add(nums[j]);
                    list1.add(nums[k]);
                    list.add(list1);
                    k--;
                    j++;
                    while (nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        System.out.println(list);
    }
}
