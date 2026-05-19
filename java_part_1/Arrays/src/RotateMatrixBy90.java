import java.util.Arrays;

public class RotateMatrixBy90 {
    public static void main(String[] args) {
        int[][] matrix= {{1, 2, 3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}

        };
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                if(i==j){

                }
                else {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        for(int k=0;k<matrix.length;k++){
            System.out.println(Arrays.toString(matrix[k]));
        }
        System.out.println();
        int i=0;int j=0;
        while (i<matrix.length){
            j=0;
            while(j<matrix[0].length/2){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
                j++;
            }
            i++;
        }
        for(int l=0;l<matrix.length;l++){
            System.out.println(Arrays.toString(matrix[l]));
        }
    }
}
