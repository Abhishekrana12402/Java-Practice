public class RowsWithMax1 {
    public static void main(String[] args) {
        int N=3, M=4;
        int[][]A={{0 ,1 ,1, 1},
                {0 ,0 ,1 ,1},
                {0 ,0 ,1 ,1}};
        System.out.println(minRow(N,M,A));
    }
   static int minRow(int N, int M, int A[][]) {
        // code here
       int ans=0;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<N;i++){
           int a=check(A[i],M);
           if (M-(a+1)>max){
               max=M-(a+1);
               ans=i;
           }
       }
       return ans;
    }
    static int check(int[] A,int M){
        int start=0;int end=M-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(A[mid]==1){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return end;
    }
}
