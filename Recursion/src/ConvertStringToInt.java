public class ConvertStringToInt {
    public static void main(String[] args) {
        String s="1337c0d3";
        System.out.println(myAtoi(s));

    }
    public static int myAtoi(String s) {
        String str=new String("");
        str=Helper(str,s);

 return Integer.parseInt(str);
    }
  static String Helper(String str,String s){
        if(s.length()==0){
            return str;
        }
        char ch=s.charAt(0);
        if(str.length()==0&&Character.isLetter(ch)){
            return "0";
        }
        if(Character.isLetter(ch)){
            return str;
        }
      else  if (str.length()==0&&(ch==' ')){
            str+="";
        }
else if(str.length()>0&&!Character.isDigit(ch)){
    return str;
}
        else {
            str += ch;

        }
         return Helper(str, s.substring(1));
   }
}
