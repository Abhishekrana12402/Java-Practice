import java.util.ArrayList;
import java.util.Arrays;

public class MazeProblem {
    public static void main(String[] args) {
       // System.out.println(Maze(0,0,""));
        boolean[][]maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] paths=new int[maze.length][maze[0].length];

        AllPaths(0,0,"",maze,paths,1);
    }
    static ArrayList<String> Maze(int row, int col, String ans){
if(row==2&&col==2){
   ArrayList<String>temp=new ArrayList<>();
   temp.add(ans);
 return   temp;
}
ArrayList<String>temp=new ArrayList<>();
if (row<2) {
    temp.addAll(Maze(row + 1, col, ans + "V"));
}
if(col<2) {
   temp.addAll(Maze(row, col + 1, ans + "H"));
}
if(row<2&&col<2){
    temp.addAll(Maze(row+1,col+1,ans+"D"));
}
return temp;
    }

    static void AllPaths(int row,int col,String ans,boolean[][]maze,int[][] paths,int step){
if(row==2&&col==2){
    paths[row][col]=step;
    for (int[] arr:paths){
        System.out.println(Arrays.toString(arr));
    }
    System.out.println(ans);
    System.out.println();
    return;
}
if(!maze[row][col]){
    return;
}
maze[row][col]=false;
paths[row][col]=step;
if (row<2){
    AllPaths(row+1,col,ans+"D",maze,paths,step+1);
}
if (col<2){
            AllPaths(row,col+1,ans+"R",maze,paths,step+1);
        }
if (row>0){
    AllPaths(row-1,col,ans+"U",maze,paths,step+1);
}
if(col>0){
    AllPaths(row,col-1,ans+"L",maze,paths,step+1);
}
maze[row][col]=true;
paths[row][col]=0;
    }
}
