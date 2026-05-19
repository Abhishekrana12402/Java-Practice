import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
       int[][] matrix = {{1,2,3,4},
                         {5,0,7,8},
                          {0,10,11,12},
                          {13,14,15,0}};
       setZeroes(matrix);
       for(int i=0;i<matrix.length;i++){
           System.out.println(Arrays.toString(matrix[i]));
       }
    }
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;int col0=-1;
        int n = matrix[0].length;
for(int i=0;i<m;i++) {
    for (int j = 0; j < n; j++) {

        if (matrix[i][j] == 0) {
            if(j==0){
                col0=0;
            }
            else {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
    }
}
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
    for(int i=1;i<m;i++){
        for(int j=1;j<n;j++){
           if(matrix[i][0]==0||matrix[0][j]==0){
               matrix[i][j]=0;
           }
        }
    }
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
        if(matrix[0][0]==0){
            for(int i=0;i<n;i++) {
                matrix[0][i]=0;
            }

        }
        if(col0==0){
            for(int i=0;i<n;i++) {
                matrix[i][0]=0;
            }

        }
        System.out.println(col0);




    }

    }

