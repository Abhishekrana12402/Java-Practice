public class PeakElementInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(peakElement(arr,arr.length));
    }
    public static int peakElement(int[] arr,int n)
    {if(n==1){
            return 0;
        }
        if(arr[0]>arr[1]){
            return 0;
        }
        if(arr[n-1]>arr[n-2]){
            return n-1;
        }

        int start=1;
        int end=arr.length-2;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[start]==arr[mid]&&arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                if(arr[end-1]>arr[end]){
                    return end-1;
                }
                start++;
                end--;
                continue;
            }
            else if (arr[mid]>arr[mid-1]) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        start=0;end=arr.length-1;
        while(start<=end&&arr[start]==arr[end]){
            start++;
            end--;
        }
        if(start>end){
            return start-1;
        }
        return -1;
    }
}
