import java.util.Arrays;

public class NKnights {
    public static void main(String[] args) {
        int[][] ans = new int[4][4];
           SolveNKnigths(0,0, ans,4);
    }
    static void SolveNKnigths(int row, int col, int[][] ans,int placed) {

        if (placed == 0) {
            for (int[] arr : ans) {
              //  System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }

        if (row == ans.length - 1 && col == ans.length) {
            return;
        }
        if (col == ans.length) {
            SolveNKnigths(row + 1, 0, ans, placed);
            return;
        }

        if (CanPlaced(row, col, ans)) {
            ans[row][col] = 1;
            SolveNKnigths(row, col + 1, ans, placed - 1);
            ans[row][col] = 0;
        }
        SolveNKnigths(row, col + 1, ans, placed);


    }
    static boolean CanPlaced(int row,int col,int[][] ans){
      if((row-2>=0&&col-1>=0)&&ans[row-2][col-1]==1){
          return false;
      }
      if((row-2>=0&&col+1<ans.length)&&ans[row-2][col+1]==1){
          return false;
      }
        if((row-1>=0&&col+2<ans.length)&&ans[row-1][col+2]==1){
            return false;
        }
        if((row-1>=0&&col-2>=0)&&ans[row-1][col-2]==1){
            return false;
        }

   return true;
    }
        }


