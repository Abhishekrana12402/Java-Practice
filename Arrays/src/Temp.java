
import java.util.ArrayList;
class Solution {
    public static int compress(char[] chars) {
        ArrayList<String> list = new ArrayList<>();
        int left = 0;
        int right = chars.length - 1;
        Integer count = 0;
        int temp = right;
        while(left <= right) {
            if(chars[left] != chars[temp]) {
                temp --;
            }
            else {
                count++;
                temp--;
            }
            if(temp < left) {
                Character letter = chars[left];
                list.add(Character.toString(letter));
                left += count;
                if(count != 1) {
                    int length = Integer.toString(count).length();
                    while(length != 0){
                        int value = (int)(count/ Math.pow(10,length-1));
                        list.add(Integer.toString(value));
                        length--;
                        count %=10;
                    }
                }
                temp = right;
                count = 0;
            }
        }
        return list.size();

    }

    public static void main(String[] args) {
        char[] ch=new char[] {'a','a','b','b','c','c','c'};
        System.out.println(compress(ch));

    }
}
