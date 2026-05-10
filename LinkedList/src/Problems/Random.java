package Problems;

import java.util.Arrays;

public class Random {
    public static void main(String[] args) {
        int[][] ans=pascalTriangle(4);
        for (int i=0;i<ans.length;i++){
            System.out.println(Arrays.toString(ans[i]) +" ");
        }
    }
    public static int[][] pascalTriangle(int N) {
        // Write your code here.
        int[][] matrix=new int[N][];
        for(int i=0;i<N;i++){
            matrix[i]=new int[i+1];
            int ans=1;
            for(int j=0;j<=i;j++){
                if(j==0){
                    matrix[i][j]=ans;
                }
                else{
                    ans=ans*(i-j+1);
                    ans/=j;
                    matrix[i][j]=ans;
                }

            }
        }
        return matrix;
    }
}
