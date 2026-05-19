import java.util.HashMap;

public class Problem {
    public static void main(String[] args) {
      int  n = 7, k = 2;
        int[] arr= {1, 7, 4, 3, 4, 8, 7};
        System.out.println(firstElementKTime(n,k,arr));

    }
    public static int firstElementKTime(int n, int k, int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
           map.put(arr[i], map.getOrDefault(arr[i],0)+1);
           if (map.get(arr[i])==k){
               return arr[i];
           }

        }

        return -1;

    }
}
