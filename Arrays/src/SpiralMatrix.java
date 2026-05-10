import java.util.ArrayList;
import java.util.Arrays;

public class SpiralMatrix{
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        ArrayList<Integer>list=new ArrayList<>();
        int start_row=0;int end_row=matrix.length-1;int start_col=0;int end_col=matrix[0].length-1;
        while(start_row<=end_row&&start_col<=end_col){
            for(int i=start_col;i<=end_col;i++){
                list.add(matrix[start_row][i]);
            }
            for(int i=start_row+1;i<=end_row;i++){
                list.add(matrix[i][end_col]);
            }
            for(int i=end_col-1;i>=start_col;i--){
                if(start_row==end_row){
                    break;
                }
                list.add(matrix[end_row][i]);
            }
            for(int i=end_row-1;i>start_row;i--){
                list.add(matrix[i][start_col]);
            }
            start_row++;
            end_row--;
            start_col++;
            end_col--;
        }
        System.out.println(list);
    }
}