
 import java.util.Arrays;
 import java.util.Scanner;
public class MultiDimension {
 /*  public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int[][] arr = new int[3][3];

       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
               arr[i][j] = in.nextInt();
           }
       }
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }//another method to print 2D
       for (int i = 0; i < arr.length; i++) {
           System.out.println(Arrays.toString(arr[i]));//another way


       }//another method to print 2D
       for(int[] a:arr){
           System.out.println(Arrays.toString(a));
       }
   }
 public static void main(String[] args) {
     Scanner in= new Scanner(System.in);
     int[][] arr=new int[3][3];
     for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[i].length;j++){
             arr[i][j]=in.nextInt();
         }
     }
     Largest(arr,arr.length);
 }
 static void Largest(int[][] arr,int n){
     int max=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++) {
         for (int j = 0; j < arr[i].length; j++) {
             max = Math.max(max, arr[i][j]);
         }
         }
     System.out.println("Largest number in the given 2D Array is:"+max);

 }
 public static void main(String[] args) {
     int[][] matrix={{1,2,3,4},
                     {5,6,7,8},
                    {9,10,11,12}};
     SpiralMatrix(matrix);
 }
 static void SpiralMatrix(int[][] matrix){
     int start_row=0;
     int start_col=0;
     int end_row=matrix.length-1;
     int end_col=matrix[0].length-1;
     while(start_row<=end_row&&start_col<=end_col){
         for(int i=start_col;i<=end_col;i++){
             System.out.print(matrix[start_row][i]+" ");
         }
         for(int i=start_row+1;i<=end_row;i++){
             System.out.print(matrix[i][end_col]+" ");
         }
         for(int i=end_col-1;i>=start_col;i--){
             if (start_row == end_row) {
                break;
            }
             System.out.print(matrix[end_row][i]+" ");
         }
         for(int i=end_row-1;i>=start_row+1;i--){
            if (start_row == end_row) {
                break;
            }
             System.out.print(matrix[i][start_col]+" ");
         }
         start_row++;
         start_col++;
         end_col--;
         end_row--;
     }
 }
 public static void main(String[] args) {
     int[][] matrix={{1,2,3,4},
             {5,6,7,8},
             {9,10,11,12},
             {13,14,15,16}};
     DiagonalSum(matrix);

 }
 static void DiagonalSum(int[][] matrix){int sum=0;
     for(int i=0;i<matrix.length;i++){
         for(int j=0;j<matrix[i].length;j++){
             if(i==j||(i+j)==matrix.length-1){
                 sum+=matrix[i][j];
             }
         }
     }
//      for(int i=0;i<matrix.length;i++){
//          sum+=matrix[i][i];
//          if(i!=matrix.length-1-i){
//              sum+=matrix[i][matrix.length-1-i];
//          }
//      }

System.out.println(sum);
 }
 public static void main(String[] args) {
     int[][] matrix={{10,20,30,40},
             {15,25,35,45},
             {27,29,37,48},
             {32,33,39,50}};
     int n=50;
     SearchingInSorted(matrix,n);
 }
 static void SearchingInSorted(int[][] matrix,int n){
     //considering right top as starting element
//      int start_row=0;int end_col=matrix[start_row].length-1;
//      while(start_row<=matrix.length-1&&end_col>=0){
//          if(n==matrix[start_row][end_col]) {
//              System.out.println("Found key at:"+ start_row+","+end_col);
//              break;
//          }
//              else if(n>matrix[start_row][end_col]){
//                  start_row++;
//          }
//          else if(n<matrix[start_row][end_col]){
//              end_col--;
//          }
//      }
     //2nd approach that is starting from left bottom
     int row=matrix.length-1;int col=0;
     while(row>=0&&col<=matrix.length-1){
         if(n==matrix[row][col]){
             System.out.println("Element found at :"+row+","+col);
             return;
         } else if (n>matrix[row][col]) {
             col++;
         }
         else if (n<matrix[row][col]) {
             row--;

         }

     }
     }
 public static void main(String[] args) {
      int[][] matrix={{4,7,8},
              {8,8,7}};int count=0;
      for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[i].length;j++){
              if(matrix[i][j]==7){
                  count++;
              }
          }
      }
     System.out.println(count);
 }
 public static void main(String[] args) {
     int[][] matrix={{1,4,9,},
             {11,4,3},
             {2,2,3}};int sum=0;
     for(int j=0;j<matrix[0].length;j++){
         sum+=matrix[1][j];
     }
     System.out.println(sum);
 }
 public static void main(String[] args) {
     int[][] matrix={{1,2,3},
             {4,5,6},
             };int[][] temp=new int[matrix[0].length][matrix.length];
     for(int i=0;i<temp.length;i++){
         for(int j=0;j<temp[0].length;j++) {
             temp[i][j] = matrix[j][i];

             System.out.print(temp[i][j]+" ");
         }
         System.out.println();
     }
 }*/
 public static void main(String[] args) {
  int[][] matrix = {{22},
          {3},
          {21},
          {2}};
  SpiralMatrix(matrix);
 }

 static void SpiralMatrix(int[][] matrix) {
  int start_row = 0;
  int start_col = 0;
  int end_row = matrix.length - 1;
  int end_col = matrix[0].length - 1;
  while (start_row <= end_row && start_col <= end_col) {
   for (int i = start_col; i <= end_col; i++) {

    System.out.print(matrix[start_row][i] + " ");
   }
   for (int i = start_row + 1; i <= end_row; i++) {

    System.out.print(matrix[i][end_col] + " ");
   }
   for (int i = end_col - 1; i >= start_col; i--) {
    if (start_row==end_row) {
     break;
    }
    System.out.print(matrix[end_row][i] + " ");
  }
   for (int i = end_row - 1; i >= start_row + 1; i--) {
    if (start_row == end_row||start_col==end_col) {
     break;
    }
    System.out.print(matrix[i][start_col] + " ");
   }
   start_row++;
   start_col++;
   end_col--;
   end_row--;
//   System.out.println(start_row);
//   System.out.println(end_row);
//   System.out.println(start_col);
//   System.out.println(end_col);
//   if(end_row<0||end_col<0){
//    return;
//   }

  }
 }
}


