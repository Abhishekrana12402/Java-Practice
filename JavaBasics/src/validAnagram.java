import java.util.Arrays;
import java.util.Map;

public class validAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s,t));
    }


    public static boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }

        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']--;
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
