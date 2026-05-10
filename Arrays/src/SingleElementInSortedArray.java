public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums={3,3,4,4,5,6,6,7,7};
//        int start=0;int end=nums.length-1;
//        while(start<=end){
//            if(start==end){
//                System.out.println(nums[start]);
//                return;
//            }
//            int mid=start+(end-start)/2;
//            if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]){
//                System.out.println(nums[mid]);
//                return;
//            }
//            if(nums[mid]==nums[mid-1]){
//                if(mid%2==0) {
//                    end = mid - 2;
//                }
//                else{
//                    start=mid+1;
//                }
//            }
//            else if( nums[mid]==nums[mid+1]){
//                if(mid%2==0) {
//                    start = mid + 2;
//                }
//                else {
//                    end=mid-1;
//                }
//            }
//        }
        int p1 = 0, p2 = nums.length - 1;
        while (p1 < p2) {
            int mid = p1 + (p2 - p1) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                p2 = mid;
            } else {
                p1 = mid + 2;
            }
        }
        System.out.println(nums[p1]);
    }
}
