package Problems;

public class Pattern {
    public static void main(String[] args) {
        int count=1;
        for(int i=1;i<=6;i++){
            if(i%3==1){
                 count=fun1(count,i);
            }
           else if(i%3==2){
                 count=fun2(count,i);
            }
            else {
                count = fun3(count, i);
            }
            System.out.println();
        }

    }
    static int fun1(int count,int row){
        for (int i=0;i<row;i++){
            System.out.print(count);
            count++;
        }
        return count;
    }
    static int fun2(int count,int row){
        for (int i=0;i<row;i++){
            System.out.print("*");
            count++;
        }
        return count;
    }
    static int fun3(int count,int row){
        for (int i=0;i<row;i++){
            char ch=(char)('a'+count-1);
            System.out.print(ch);
            count++;
        }
        return count;
    }
}
