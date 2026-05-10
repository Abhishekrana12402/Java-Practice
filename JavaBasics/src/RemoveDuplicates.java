public class RemoveDuplicates {
    public static void main(String[] args) {
       String S = "abccbccba";
        System.out.println(rremove(S));
    }
    static String rremove(String s) {
        // code here
        return Helper( s,"",0);
    }
    static String Helper(String s,String ans,int index){
        if(index==s.length()){
            return ans;
        }
        if (ans.isEmpty()){
            return Helper(s,ans+s.charAt(index),index+1);
        }
        char ch1=ans.charAt(ans.length()-1);
        char ch2=s.charAt(index);
        if(ch2==ch1){
            Helper(s,ans.substring(0, ans.length() - 1), index+1);
        }
        return Helper(s,ans+ch2,index+1);
    }
}
