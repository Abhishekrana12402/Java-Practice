import java.util.HashMap;
import java.util.Map;

public class NumberOfSubArraysWithXorK {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int xor = 0;
        int target_Xor = 6;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < arr.length; i++) {
            xor=xor^arr[i];
            int x = xor ^ target_Xor;
            if (map.containsKey(x)) {
            count += map.get(x);
        }
        map.put(xor, map.getOrDefault(xor, 0) + 1);
    }
        System.out.println(count);
    }
}
