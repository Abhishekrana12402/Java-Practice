import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElementNby3 {
    public static void main(String[] args) {
        int[] arr={2,2};
        ArrayList<Integer>list=new ArrayList<>();
       HashMap<Integer,Integer>map=new HashMap<>();
       int count=1;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get( arr[i])>arr.length/3 ){
               list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
