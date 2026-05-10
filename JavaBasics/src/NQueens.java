import java.util.ArrayList;
import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
int[][] ans=new int[4][4];
        System.out.println(SolveNQueen(0,ans));
    }
static int SolveNQueen(int row,int[][] ans){
        int count=0;
        if (row==ans.length){
            for (int[] arr:ans){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
           return 1;
        }

        for( int j=0;j<ans.length;j++){
            if(CanPlace(ans,row,j)){
                ans[row][j]=1;
               count+=SolveNQueen(row+1,ans);
                ans[row][j]=0;
            }

        }

    return count;
}
static boolean CanPlace(int[][] ans,int row,int col){
        //for same col
    for (int i=0;i<row;i++){
        if(ans[i][col]==1){
            return false;
        }
    }
    for(int i=row, j=col;i>=0&&j>=0;i--,j--){
        if (ans[i][j]==1){
            return false;
        }
    }
    for(int i=row,j=col;i>=0&&j<ans.length;j++,i--){
        if(ans[i][j]==1){
            return false;
        }
    }
return true;
}
}
