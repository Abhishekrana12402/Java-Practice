public class Board {
   static boolean ans=false;

    public static void main(String[] args) {
       char[][] board = {
               {'A', 'B', 'C', 'E'},
               {'S', 'F', 'C', 'S'},
               {'A', 'D', 'E', 'E'}
       };String word = "SEE";
        System.out.println(exist(board,word));
    }
    public static boolean exist(char[][] board, String word) {
        StringBuilder sb=new StringBuilder();
        Helper(0,board,word,0,0,sb);
        return ans;
    }
  static   void Helper(int index,char[][] board,String word, int row,int col, StringBuilder sb){

      if(row<0||row==board.length||col<0||col==board[0].length){
          return;
      }

      if(board[row][col]==word.charAt(index)){
          index+=1;
          sb.append(board[row][col]);
      }
      if(sb.toString().equals(word)){
          ans=true;
          return;
      }
      Helper(index,board,word,row+1,col,sb);
      Helper(index,board,word,row,col+1,sb);
      Helper(index,board,word,row-1,col,sb);
      Helper(index,board,word,row,col-1,sb);
      if(sb.length()>0){
          sb.deleteCharAt(sb.length() - 1);
      }
    }
}