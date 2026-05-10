import java.util.Scanner;

public class SkillFull {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Binary String: ");
        String s=sc.nextLine();
        System.out.print("Enter the number of iterations: ");
        int r=sc.nextInt();
        System.out.print("Enter the Character index: ");
        int n=sc.nextInt();
char ans=Helper(s,r,n);
        System.out.println("Character at index n of Binary String after performing r iterations: "+ ans);
    }
    static char Helper(String s,int r,int n){
         String ans=Solve(s,r,n,0);
        System.out.println("String after performing r iterations: "+ans);
         return ans.charAt(n);
    }
    static String Solve(String s,int r,int n,int index){
       if(index==s.length()){
           r-=1;
           index=0;
       }
       if(r==0){

          return s;
       }
        char ch=s.charAt(index);
        if(ch=='0'){
           String left=s.substring(0,index);
           String right=s.substring(index+1,s.length());
s=left+"01"+right;
            Solve(s,r,n,index+2);
        }
        else {
            String left = s.substring(0, index);
            String right = s.substring(index + 1, s.length());
            s = left + "10" + right;
        }
       return Solve(s, r, n, index + 2);

    }
}
