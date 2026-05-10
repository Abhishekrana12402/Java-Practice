package Practice;

public class Matrix {

    public static boolean exist(char[][] board, String word) {
        boolean ans=false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    ans= Helper(0,i,j,board,word);
                }
                if(ans){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean Helper(int index,int row,int col,char[][] board,String word){
        if(index==word.length()){
            return true;
        }
        if(row<0||row>=board.length||col<0||col>=board[0].length){
            return false;
        }
        if(word.charAt(index)!=board[row][col]){
            return false;
        }
        char temp=board[row][col];
        board[row][col]='*';
        boolean found=
                Helper(index+1,row+1,col,board,word)||
                        Helper(index+1,row,col+1,board,word)||
                        Helper(index+1,row-1,col,board,word)||
                        Helper(index+1,row,col-1,board,word);
        board[row][col]=temp;
        return found;
    }

    public static void main(String[] args) {
       char[][] board = {{'A','B','C','E'},
               {'S','F','C','S'},
               {'A','D','E','E'}};
       String word="ABCB";
        System.out.println(exist(board,word));
    }
}
