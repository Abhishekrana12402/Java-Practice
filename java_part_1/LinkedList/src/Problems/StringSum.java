
package Problems;

public class StringSum {
    public static void main(String[] args) {

String s="100";
int[][] matrix={{1,3,100},
        {1,1,-10},
        {2,2,-20},
        {3,3,-30}};
        System.out.println(Sum(s,matrix));

    }
    static int Sum(String s,int[][]matrix){
        int score=0;
        for(int i=0;i<matrix.length;i++){
            int start_range=matrix[i][0];
            int end_range=matrix[i][1];
            if(check(s,start_range,end_range)){
                score+=matrix[i][2];
            }
        }
        return score;
    }
    static Boolean check(String s,int start,int end){
        for(int i=start-1;i<end;i++){
            if(s.charAt(i)=='1'){
                return true;
            }
        }
        return false;
    }
}
