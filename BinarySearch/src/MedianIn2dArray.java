public class MedianIn2dArray {
    public static void main(String[] args) {
       int R = 3, C = 1;
     int[][] M = {{1},{2},{3}};
        System.out.println(median(M,R,C));
    }
   static int median(int matrix[][], int R, int C) {
        // code here
       int low=Integer.MAX_VALUE;int high=Integer.MIN_VALUE;int smaller=(R*C)/2;
       for(int i=0;i<R;i++){
           low=Math.min(low,matrix[i][0]);
           high=Math.max(high,matrix[i][C-1]);
       }
       while (low<=high){
           int mid=low+(high-low)/2;
           int ans=Check(matrix,R,C,mid);
           if(ans<=smaller){
               low=mid+1;
           }
           else {
              high=mid-1;
           }
       }
       return high;
    }
    static int Check(int[][] matrix,int row,int col,int x){
      int count=0;
      for(int i=0;i<row;i++){
          count+=SmallerThenXCount(matrix,row,col,x,i);
      }
      return count;
    }
    static int SmallerThenXCount(int[][]matrix,int row,int col,int x,int curr_row){
        int low=0;int high=col-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(matrix[curr_row][mid]>=x){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }
}
