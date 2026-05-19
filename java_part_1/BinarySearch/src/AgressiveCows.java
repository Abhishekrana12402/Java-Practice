import java.util.Arrays;

public class AgressiveCows {
    public static void main(String[] args) {
       int n=6;int k=5;int[] stalls={2 ,12, 11, 3, 26, 7};
        System.out.println(solve(n,k,stalls));
    }
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
       int start=0;
       int end=stalls[n-1]-stalls[0];
       while (start<=end){
           int mid=start+(end-start)/2;
           int ans=Check(n,k,stalls,mid);
           if(ans==1){
               start=mid+1;
           }
           else {
               end=mid-1;
           }
       }
       return end;
}
static int Check(int n,int k,int[] stalls,int mid){
        int last=stalls[0];
        k=k-1;
   for (int i=1;i<n;i++){
       if(stalls[i]-last>=mid){
           k--;
           last=stalls[i];
       }
   }
   if (k<=0){
       return 1;
   }
   return -1;
}
}
