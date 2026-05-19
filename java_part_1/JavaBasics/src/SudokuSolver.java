import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SudokuSolver {
    public static void main(String[] args) {



        int[][] sudoku = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        System.out.println(solve(sudoku));
    }
    static boolean solve(int[][] board){
        boolean empty_left=true;
     int n=board.length;
     int row=-1;
     int col=-1;
     for(int i=0;i<n;i++){
     for (int j=0;j<n;j++){
         if(board[i][j]==0){
             row=i;
             col=j;
             empty_left=false;
             break;
         }
     }
     if(empty_left==false){
         break;
     }

     }
     if (empty_left==true){
         return true;
     }
     for (int num=1;num<=board.length;num++){
         if (isSafe(board,row,col,num)){

           board[row][col]= num;
           if (solve(board)){
               display(board);
               return true;
           }
           else {
               board[row][col]=0;

           }
         }
     }
     return false;
    }
    private static void display(int[][] board){
        for (int[] row:board){
            for (int num:row ){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(int[][] board,int row,int col,int num){
        //check row
        for(int i=0;i<board.length;i++){
            if(board[row][i]==num){
                return false;
            }
        }
        for(int i=0;i<board.length;i++){
            if(board[i][col]==num){
                return false;
            }
        }
        int subMatrix=(int)Math.sqrt(board.length);
        row=row-row%subMatrix;
        col=col-col%subMatrix;
        for (int i=row;i<row+subMatrix;i++){
            for (int j=col;j<col+subMatrix;j++){
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
