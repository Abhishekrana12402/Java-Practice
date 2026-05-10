import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Anagrams {
    public static void main(String[] args) {
        String[] str= {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String str:strs) {

            char[] array = str.toCharArray();
            Arrays.sort(array);
            String s=new String(array);
            if(!map.containsKey(s)){
              List<String>small=new ArrayList<>();
              small.add(str);
              map.put(s,small);
            }
            else{
                map.get(s).add(str);
            }
        }
        return new ArrayList<>(map.values());
    }
}
