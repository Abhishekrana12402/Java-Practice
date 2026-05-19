public class FindInInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7,8,10,11,12,15,20,23,28};
        int start=0;
        int end=1;
        int target=10;int ans=-1;
        while(target>arr[end]){
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
        }

        ans=BinarySearch(arr,start,end,target);
    }
    static int BinarySearch(int[] arr,int start,int end,int target){

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
