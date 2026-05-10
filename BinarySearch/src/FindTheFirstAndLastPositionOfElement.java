import java.util.Arrays;

public class FindTheFirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=6;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
int[] temp=new int[2];
int start=0;int end=nums.length-1;
while (start<=end){
int mid=start+(end-start)/2;
if(nums[mid]<=target){
    start=mid+1;
}
else{
    end=mid-1;
}
}
        temp[1]=end;
        System.out.println(end);
start=0;end=nums.length-1;
while(start<=end){
   int mid=start+(end-start)/2;
   if(nums[mid]>=target){
      end=mid-1;
   }
   else{
       start=mid+1;
   }
}
     temp[0]=start;
return temp;
    }
}
