import java.util.*;
public class PhoneNumber {

        public  static List<String> letterCombinations(String digits) {
            List<String> list=new ArrayList<>();
            if(digits.isEmpty()){
                return list;
            }
            LetterCombination(digits,"",list);
            return list;
        }
        public static void LetterCombination(String s1,String s2, List<String> list ){
            if(s1.isEmpty()){
                list.add(s2);
                return;
            }
            int digit=s1.charAt(0)-'0';
            int start=(digit-2)*3;
            int end=3*(digit-1);
            if(digit>7) {
                start += 1;
            }
            if(digit==7||digit==8){
                end+=1;
            }
            if(digit==9){
                end+=2;
            }

            for(int i=start;i<end;i++){
                char ch=(char) ('a'+i);
                LetterCombination(s1.substring(1),s2+ch,list);
            }
        }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(letterCombinations(str));
    }
    }


