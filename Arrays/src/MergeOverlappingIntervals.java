import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals={{2,3},{4,5},{6,7},{8,9},{1,10}};
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
       for(int i=0;i<intervals.length;i++){
           if(list.isEmpty()||intervals[i][0]>list.get(list.size()-1).get(1)+1){
List<Integer>list1=new ArrayList<>();
list1.add(intervals[i][0]);
list1.add(intervals[i][1]);
list.add(list1);
           }
           else{
               list.get(list.size()-1).set(1,Math.max(list.get(list.size()-1).get(1),intervals[i][1]));
           }
           System.out.println(list);
       }
       int[][] ans=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            for(int j=0;j<2;j++){
              ans[i][j]=list.get(i).get(j);
            }
        }
//        for(int i=0;i<ans.length;i++){
//            System.out.println(Arrays.toString(ans[i]) +" ");
//        }
    }

}
