import java.util.ArrayList;
import java.util.Arrays;

public class Prac {

    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        merge(intervals);


    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0;i< intervals.length;i++){
          if(list.size()>0&&intervals[i][0]<=list.get(list.size()-1).get(1)){
              int temp=Math.max(list.get(list.size()-1).get(1),intervals[i][1]);
              list.get(list.size()-1).set(1, temp);
          }
          else{
              ArrayList<Integer>list1=new ArrayList<>();
              list1.add(intervals[i][0]);
              list1.add(intervals[i][1]);
              list.add(list1);
          }
            System.out.println(list);;
        }
        int[][] ans=new int[list.size()][2];
        for (int i=0;i<ans.length;i++){

                ans[i][0]=list.get(i).get(0);
                ans[i][1]=list.get(i).get(1);

        }
        return ans;
    }

}
