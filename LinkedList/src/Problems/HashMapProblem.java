package Problems;

import java.util.HashMap;


public class HashMapProblem {
    public static void main(String[] args) {
int[] arr={1,2,3,2};
int k=2;
        System.out.println(findSubArraySum(arr,arr.length,k));
    }
   public static int findSubArraySum(int a[], int N, int b)
    {
        // code here
        HashMap <Integer,Integer> map=new HashMap<>();int count=0;
        int xor=0;
        map.put(0,0);
        for(int i=0;i<a.length;i++){
            xor^=a[i];
            int temp=xor^b;
            if(map.containsKey(temp)){
                count++;
            }
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        for (Integer key : map.keySet()) {

            Integer value = map.get(key);
            count+=value;
        }
        return count;
    }
}
