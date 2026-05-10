import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int row=7;
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=1;i<row;i++){
             long ans=1;
          temp.clear();
            for(int j=0;j<i;j++){
                if(j==0){
                   temp.add((int) ans);
                }
                else {
                    ans=ans*(i-j);
                    ans/=j;
                    temp.add((int) ans);
                }
            }
            list.add(temp);

        }
        System.out.println(list);
    }
}
