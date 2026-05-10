import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithOutRepeating {
    public static void main(String[] args) {
       String s = "aab";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        if(s.isEmpty()){
            return 0;
        }
        int max = 1;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
            }
            else{
               while(left<right){
                   set.remove(s.charAt(left++));
               }
            }
            max= Math.max(max,right-left);
        }
        return max;
    }
    }

