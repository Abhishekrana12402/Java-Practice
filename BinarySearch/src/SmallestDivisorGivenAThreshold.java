public class SmallestDivisorGivenAThreshold {
    public static void main(String[] args) {
       int[] nums={21212,10101,12121}; int threshold=1000000;
        System.out.println(smallestDivisor(nums,threshold));
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
for(int i=0;i<nums.length;i++){
  max=Math.max(max,nums[i]);
}
if(nums.length==threshold){
    return max;
}
int start=0;int end=max;
while (start<=end){
    int mid=start+(end-start)/2;
    int ans=Check(nums,mid,threshold);
    if(ans==1){
        end=mid-1;
    }
    else {
        start=mid+1;
    }
}
return start;
    }
    static int Check(int[] nums,int mid,int threshold){
        if(mid==0){
            return -1;
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            count+=Math.ceilDiv(nums[i],mid);
        }
        if(count<=threshold){
            return 1;
        }
        return -1;
    }
}
