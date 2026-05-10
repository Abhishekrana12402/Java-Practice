
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int N=10;
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int S=15;
        System.out.println("Range for the target Sum is "+FindSum(N,arr,S));
        System.out.println(Arrays.toString(arr));

    }
    static ArrayList<Integer> FindSum(int n,int[] arr,int sum){
        ArrayList<Integer>list=new ArrayList<>();
        int temp=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            temp+=arr[i];
            arr[i]=temp;
            if(!map.containsKey(temp)){
                map.put(temp,i);
            }
            int target=arr[i]-sum;
            if(map.containsKey(target)){
                list.add(map.get(target)+2);
                list.add(i+1);
                return list;
            }
        }
       list.add(-1);
        list.add(-1);
        return list;
    }
}
