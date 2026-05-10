import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Problem2 {
    public static void main(String[] args) {
        int[]arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

      while (map.size()!=0){
          Map.Entry<Integer, Integer> entry = map.entrySet().iterator().next();

          // Retrieve key and value
        Integer key=entry.getKey();
          Integer value = entry.getValue();

          // Process the key and value here
          System.out.println("Key: " + key + ", Value: " + value);

          // Remove the key-value pair
          map.remove(key);
          if(map.containsValue(value)){
              return false;
          }
      }
      return true;

    }
}
