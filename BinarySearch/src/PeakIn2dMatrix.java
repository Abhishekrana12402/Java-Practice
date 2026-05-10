import java.util.Arrays;

public class PeakIn2dMatrix {
    public static void main(String[] args) {
       int[][] mat ={{1,4},{3,2}};
        System.out.println(Arrays.toString(findPeakGrid(mat)));
    }
    public static int[] findPeakGrid(int[][] mat) {
int n=mat.length;int m=mat[0].length;
int low=0;int high=m-1;
while (low<=high){
    int mid=low+(high-low)/2;
    int maxElementRow=FindMaxElementInCol(mat,n,m,mid);
    int leftElement=mid-1>=0? mat[maxElementRow][mid-1]:-1;
    int rightElement=mid+1<m? mat[maxElementRow][mid+1]:-1;
    if(mat[maxElementRow][mid]>leftElement&&(mat[maxElementRow][mid]>rightElement)){
        return new int[] {maxElementRow,mid};
    } else if (leftElement>mat[maxElementRow][mid]) {
        high=mid-1;
    }
    else {
        low=mid+1;
    }
}
return new int[]{-1,-1};
    }
    static int FindMaxElementInCol(int[][] mat,int n,int m,int mid){
        int max=Integer.MIN_VALUE;int index=-1;
for (int i=0;i<n;i++) {
  if (mat[i][mid]>max){
      max=mat[i][mid];
      index=i;
  }
}
return index;
    }
}
