

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 12, 13, 0, 1, 2, 3, 5, 6};
        int ans = Search(arr, 2, 0, arr.length - 1);
        System.out.println(ans);
    }

    static int Search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[start] < arr[mid]) {
                if (arr[start] <= target && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] <= target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

//public static void main(String[] args) {
//
//    int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
//    int start = 0;
//    int end = arr.length - 1;
//    int ans=-1;
//    int Pivot = FindPivot(arr, start, end);
//    System.out.println(Pivot);
//    int target=0;
//    if(Pivot==-1){
//        ans= BinarySearch(arr,start,end,target);
//        System.out.println(ans);
//        return;
//    }
//   else if(arr[Pivot]==target){
//        System.out.println(Pivot);
//        return;
//    }
//
//    if(target<arr[Pivot]) {
//         ans = BinarySearch(arr, Pivot+1, end,target);
//    }
//    else {
//        ans = BinarySearch(arr, start, Pivot-1,target);
//    }
//    System.out.println(ans);
//}
//    public static int FindPivot(int[] arr,int start,int end){
//
//    while (start<=end) {
//        int mid = start + (end - start) / 2;
//if(mid+1<=end&&arr[mid]>arr[mid+1]){
//    return mid;
//}
//
//if(mid-1>=start&&arr[mid]<arr[mid-1]){
//    return mid-1;
//}
//else if(mid+1<=end&&arr[mid]<arr[mid+1]&&arr[start]<=arr[mid]){
//    start=mid+1;
//}
//else {
//    end=mid-1;
//}
//    }
//    return -1;
//}
//static int BinarySearch(int[] arr,int start,int end,int target){
//    while (start<=end){
//       int mid=start+(end-start)/2;
//        if(arr[mid]==target){
//            return mid;
//        } else if (arr[mid]>target) {
//            end=mid-1;
//        }
//        else start=mid+1;
//    }
//    return -1;
//}
}
