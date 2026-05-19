public class SearchIn2dMatrix{

    public static void main(String[] args) {
       int[][] matrix ={{1,3,5,7},{10,11,16,20},{23,30,34,60}}; int target = 11;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
//int start_row=0;int end_col=matrix[0].length-1;
//
//while (start_row< matrix.length&&end_col>=0){
//    int key=matrix[start_row][end_col];
//    if(key==target){
//        return true;
//    } else if (key>target) {
//        end_col--;
//    }
//    else {
//        start_row++;
//    }
//}
//        return false;
        int row_no=matrix.length;int col_no=matrix[0].length;
        int low=0;int high= row_no*col_no-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            int row=mid/col_no;
            int col=mid%col_no;
            if(matrix[row][col]==target){
                return true;
            } else if (target>matrix[row][col]) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return false;
    }
}

