import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedMap;

public class Recursion {
    public static void main(String[] args) {
       // nthFibonacci(8,0,1);
      //  System.out.println(nthFibonacci2(8));
        int[] arr={5,6,7,8,9,1,2,3};
        //System.out.println(BinarySearch(0,arr.length-1,arr,5));
       // fun(5);
        //System.out.println(fact(5));
        //System.out.println(SumofDigits(1234));
       // System.out.println(Reverse(12345));
        //System.out.println(Palindrome(121));
        //System.out.println(CountZeroes(30204));
       // System.out.println(Sorted(arr,1));
        //System.out.println(FindTarget(arr,0,5));
      //  System.out.println(RotatedBinarySearch(arr,0,arr.length-1,3));
       // Pattern(5,0,0);
        System.out.println(Arrays.toString(BubbleSort(arr,0,0)));
    }
    static void nthFibonacci(int n,int a,int b){
        if(n==1){
            System.out.println(b);
            return;
        }

       nthFibonacci(n-1,b,a+b);
    }
    static int nthFibonacci2(int n){
        if(n==1||n==0){
            return n;
        }
       return nthFibonacci2(n-1)+nthFibonacci2(n-2);
    }
    static int BinarySearch(int start,int end,int[] arr,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            BinarySearch(start,mid-1,arr,target);
        }

            return BinarySearch(mid+1,end,arr,target);

    }
    static void fun(int n){
        if(n==0){
           return;
        }
        fun(n-1);
        System.out.println(n);
    }
    static int fact(int n){
        if(n==1){
            return n;
        }
        return n*fact(n-1);
    }
    static int SumofDigits(int n){
        if(n/10==0){
            return n;
        }
      return   n%10+SumofDigits(n/10);
    }

    static int Reverse(int n) {
    if(n/10==0){
        return n;
    }
    return (int) ((n%10)*Math.pow(10,Help(n))+(Reverse(n/10)));
    }
    static int Help(int n) {
        int count = 0;
        while (n!=0){
            count++;
            n/=10;
    }
        return count-1;

    }
    static boolean Palindrome(int n){
        return n==Reverse(n);
    }

static int CountZeroes(int n){
    int count=0;
        if(n==0){
            return count;
        }

        if(n%10==0){
           count++;
        }
       return count+=CountZeroes(n/10);
}
static boolean Sorted(int[] arr,int index){
if(index==arr.length){
    return true;
}
if(arr[index]<arr[index-1]){
    return false;
}
return Sorted(arr,index+1);
}
static ArrayList<Integer> FindTarget(int[] arr,int index,int target){
     ArrayList<Integer>list=new ArrayList<>();
        if(index==arr.length){
         return list;
     }
        if(arr[index]==target){
            list.add(index);
        }

        list.addAll(FindTarget(arr,index+1,target));
        return list;
}
static int RotatedBinarySearch(int[] arr,int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<arr[mid]) {
            if (arr[start] <= target && target <= arr[mid]) {
                return RotatedBinarySearch(arr, start, mid - 1, target);
            } else {
                return RotatedBinarySearch(arr, mid + 1, end, target);
            }
        }
        else {
            if(arr[mid]<=target&&target<=arr[end]){
                return RotatedBinarySearch(arr,mid+1,end,target);
            }
            else {
                return RotatedBinarySearch(arr,start,mid-1,target);
            }
        }
}


static void Pattern(int n,int row,int col){
        if(row==n){
            return;
        }
        if(col<n-row){
            System.out.print("*");
            Pattern(n,row,col+1);
        }
      else {
            System.out.println();
          Pattern(n,row+1,0);
        }


    }
    static int[] BubbleSort(int[] arr,int i,int j){
        if(i==arr.length){
            return arr;
        }

       if(j<arr.length-1-i){
           if (arr[j]>arr[j+1]) {
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
           }
           return BubbleSort(arr,i,j+1);

       }

            return BubbleSort(arr,i+1,0);


    }


}
