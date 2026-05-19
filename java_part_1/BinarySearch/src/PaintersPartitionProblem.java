public class PaintersPartitionProblem {
    public static void main(String[] args) {
       int n = 10;
       int k = 7;
       int[] arr = {10,5, 20, 25, 17, 23, 2 ,9 ,4, 13};
        System.out.println(minTime(arr,n,k));
    }
    static long minTime(int[] arr,int n,int k){
        //code here
        long start=arr[0];long end=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>start){
               start=arr[i];
           }
           end+=arr[i];
        }
        while (start<=end){
            long mid=start+(end-start)/2;
            int ans=Check(arr,n,k,mid);
            if(ans==1){
               start=mid+1;
            }
            else {
               end=mid-1;
            }
        }
        return start;
    }
    static int Check(int[] arr,int n,int k,long board){
        int sum=0;
        k=k-1;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=board){
                sum+=arr[i];
            } else {
                k--;
                sum=arr[i];
            }

        }
       if(k<0){
            return 1;
        }
        return -1;
    }
}
