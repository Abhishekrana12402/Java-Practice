public class RotatedBinarySearchWithDuplicates {
    public static void main(String[] args) {

        int[] arr = {1,4,3,4,1};
        int start = 0;
        int end = arr.length - 1;
        int ans=-1;
        int Pivot = FindPivot(arr, start, end);
        System.out.println(Pivot);
        int target=1;
        if(Pivot==-1){
            ans= BinarySearch(arr,start,end,target);
            System.out.println(ans);
            return;
        }
        else if(arr[Pivot]==target){
            System.out.println(Pivot);
            return;
        }

        if(target<arr[0]) {
            ans = BinarySearch(arr, Pivot+1, end,target);
        }
        else {
            ans = BinarySearch(arr, start, Pivot-1,target);
        }
        System.out.println(ans);
    }
    public static int FindPivot(int[] arr,int start,int end){

        while (start<=end) {
            int mid = start + (end - start) / 2;
            if(mid+1<=end&&arr[mid]>arr[mid+1]){
                return mid;
            }

            if(mid-1>=start&&arr[mid]<arr[mid-1]){
                return mid-1;
            } else if (arr[start]==arr[mid]&&arr[mid]==arr[end]) {
                if(arr[start]>arr[start+1]){
                    return start;
                    //before skipping the start check if it was the potential pivot or not
                }
                start++;
                if(arr[end-1]>arr[end]){
                    return end-1;
                    //before skipping the end check if it was the potential pivot or not
                }
                end--;
            }
           else if(arr[start]<arr[mid]||arr[start]==arr[mid]&&arr[mid]>arr[end]){
                start=mid+1;
                //check in the right half as all the elements before the mid will be smaller and not be potential pivot
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
    static int BinarySearch(int[] arr,int start,int end,int target){
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                end=mid-1;
            }
            else start=mid+1;
        }
        return -1;
    }
}
