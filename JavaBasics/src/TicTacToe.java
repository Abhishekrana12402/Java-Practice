import jdk.swing.interop.DropTargetContextWrapper;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char[][] board=new char[3][3];
        for(int i=0;i<board.length;i++){
            for(int j=0;j< board.length;j++){
                board[i][j]=' ';
            }
        }
        boolean gameOver=false;
        char PlayerTurn='X';
        while (!gameOver){
            printBoard(board);
            System.out.println("Player "+PlayerTurn+"Enter your position"+" ");

            int row=in.nextInt();
            int col=in.nextInt();
            boolean tie=  CheckTieStatus(board);
            if(board[row][col]==' '){
               board[row][col]=PlayerTurn;
              gameOver= CheckWinStatus(board,PlayerTurn);
               if(gameOver){
                   System.out.println(PlayerTurn+" has won the match");
               }
               else{
                   PlayerTurn=PlayerTurn=='X'? '0':'X';
               }
            }
            else {
                System.out.println("Invalid Move: Please Enter the correct position");
            }
            if(!tie){
                System.out.println("Match Tied ");
                return;
            }
        }
        printBoard(board);
    }
    public static void printBoard(char[][] board){
for (int row=0;row<board.length;row++){
    for(int col=0;col< board.length;col++){
        System.out.print(board[row][col]+"|");
    }
    System.out.println();
}
    }
    public static boolean CheckWinStatus(char[][] board,char player){
for(int row=0;row<board.length;row++){
        //check for all the rows
    if(board[row][0]==player&&board[row][1]==player&&board[row][2]==player){
        return true;
    }
}
        for(int col=0;col<board.length;col++){
            //check for all the rows
            if(board[0][col]==player&&board[1][col]==player&&board[2][col]==player){
                return true;
            }
        }
        if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player){
            return true;
        }
        if(board[0][2]==player&&board[1][1]==player&&board[2][0]==player){
            return true;
        }
        return false;
    }

   public static boolean CheckTieStatus(char[][] board){
        int count=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j< board.length;j++){
                if(board[i][j]==' '){
                    count++;
                }
            }
        }
        if(count==9){
            return false;
        }
        return true;
   }
}
