import java.util.ArrayList;
import java.util.Arrays;

public class DivideAndConquer {
    /* public static void main(String[] args) {
         int[] arr={6,3,9,5,2,8};
         MergeSort(arr,0,arr.length-1);
         System.out.print(Arrays.toString(arr));
     }
     public static void MergeSort(int[] arr, int StartIndex,int EndIndex){
         if(StartIndex>=EndIndex){
             return;
         }
      int mid=StartIndex+(EndIndex-StartIndex)/2;
      MergeSort(arr,StartIndex,mid);//left part
      MergeSort(arr,mid+1,EndIndex);//right part
      Merge(arr,StartIndex,mid,EndIndex);
     }
     public static void Merge(int[] arr,int StartIndex,int mid,int EndIndex){
         int i=StartIndex;//iterator of left part
         int j=mid+1;//iterator of right path
         int k=0;//iterator for temporary array in which we will store combine result of left part and right path
         int[] temp=new int[EndIndex-StartIndex+1];//suppose left part is from (0,3) and right path is from(4,6) then number
         // of elements after combining will be (6-0+1)
         while(i<=mid &&j<=EndIndex){
             if(arr[i]<arr[j]){
                 temp[k]=arr[i];
                 i++;
             }
             else{
                 temp[k]=arr[j];
                 j++;
             }
             k++;
         }
         //remaining elements from left array
         while(i<=mid){
             temp[k++]=arr[i++];
         }
         //remaining array from right array
         while(j<=EndIndex){
             temp[k++]=arr[j++];
         }
         //copy to original array
         for( k=0,i=StartIndex;k<temp.length;k++,i++){
 arr[i]=temp[k];
         }
     }
    public static void main(String[] args) {
        int[] arr={6,3,9,8,2,5};
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void QuickSort(int[] arr,int StartIndex,int EndIndex){
        if(StartIndex>=EndIndex){
            return;
        }
        int PivotIndex=Partition(arr,StartIndex,EndIndex);
        QuickSort(arr,StartIndex,PivotIndex-1);
        QuickSort(arr,PivotIndex+1,EndIndex);
    }
    static int Partition(int[] arr,int StartIndex,int EndIndex){
        int i=StartIndex-1;
        int Pivot=arr[EndIndex];
        for(int j=StartIndex;j<arr.length;j++){
            if(arr[j]<Pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=arr[EndIndex];
        arr[EndIndex]=arr[i];
        arr[i]=temp;
    return i;}


    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int TargetIndex = CyclicRotatedSearch(arr, 2, 0, arr.length - 1);
        System.out.println(TargetIndex);
    }

     public static int CyclicRotatedSearch(int[] arr, int target, int StartIndex, int EndIndex) {
         int mid = StartIndex + ( EndIndex-StartIndex) / 2;
         if(StartIndex>EndIndex){
             return -1;
         }
         if (arr[mid] == target) {//best case
             return mid;
         }
         //Target is on line 1
         if (arr[StartIndex] <= arr[mid]) {
             //Cae A:Left Part
             if (arr[StartIndex] <= target && target <= arr[mid]) {
                 return CyclicRotatedSearch(arr, target, StartIndex, mid - 1);
             }//Case B:Right Part
             else {
                 return CyclicRotatedSearch(arr, target, mid + 1, EndIndex);
             }
         }
         //On line 2
         else{
             //Case C:Right Part
             if(arr[mid]<=target&&target<=arr[EndIndex]){
                 return CyclicRotatedSearch(arr,target,mid+1,EndIndex);
             }
 //Case D:Left Part
             else {
                 return CyclicRotatedSearch(arr,target,StartIndex,mid-1);
             }
         }

     }


   */ public static void main(String[] args) {
        int[] arr={3,4,5,6,7,0,1,2};
        int ans=Search(arr,1);
        System.out.println(ans);
    }
    static int Search(int[] arr,int target){
        int pivot=RotatedBinarySearch(arr);
        int start=0;int mid=0;
        int end=arr.length-1;
        if(arr[pivot]==-1) {
            return BinarySearch(arr, 0, arr.length -1,target);
        }
            else if(target>arr[start]){
                return BinarySearch(arr,start,pivot-1,target);
        }
            return BinarySearch(arr,pivot+1,end,target);

    }
     static int BinarySearch(int[] arr, int start,int end,int target){
         while (start <= end) {
             int mid = (start + end)/2;
             if (target == arr[mid]) {
                 return mid;
             } else if(target>arr[mid]){
                 start=mid+1;
             }
             else{
                 end=mid-1;
             }
         }
         return-1;
    }

    static int RotatedBinarySearch(int[] arr){
        int start=0;int mid=0;
        int end=arr.length-1;
        while(start<=end){
             mid=start+(end-start)/2;
            if( mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            start=mid+1;

        }
    return -1; }





   /* public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target=1;
      int ans= Range(arr,target);
        System.out.println(ans);
    }
    static int Range(int[] arr,int target){
        int start=0;int end=arr.length-1;
      int pivot=FindingPivot(arr,start,end,target);
      if(arr[pivot]==-1) {
          return BinarySearch(arr, start, end, target);
      }
      if(arr[pivot]==target){
          return pivot;
      }
          else if(target>arr[start]){
              return BinarySearch(arr, start, pivot-1, target);
      }
          return BinarySearch(arr,pivot+1,end,target);

    }
    static int BinarySearch(int[] arr,int start,int end,int target){
        while (start <= end) {
            int mid = (start + end)/2;
            if (target == arr[mid]) {
                return mid;
            } else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return-1;

    }
    static int FindingPivot(int[] arr,int start,int end,int target){
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (mid > start && arr[mid] <= arr[mid - 1]) {
                return mid - 1;
            }
            if (mid < end && arr[mid] >= arr[mid + 1]) {
                return mid;
            } else if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    return -1;}

    */

}
