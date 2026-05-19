package Problems;

public class Temp {
    public static void main(String[] args) {
       int n = 3, k = 1;
        System.out.println(findKthBit(n,k));

    }
    public static char findKthBit(int n, int k) {
        String s=new String("0");
        if(n==1) {

            return s.charAt(0);
        }
           String ans= Helper(s,n-1);
        System.out.println(ans);
            return 'c';
        }
       static String Helper(String str,int n){

            if(n==0){
                return str;
            }
           str+="1"+invert(str);
           return Helper(str,n-1);
        }
       static String invert(String str){
            String temp="";
            for(int i=str.length()-1;i>=0;i--){
                if(str.charAt(i)=='0'){
                    temp+="1";
                }
                else{
                    temp+="0";
                }
            }
            return temp;
        }

    }

