public class BleakOrNot {
    public static void main(String[] args) {
int n=3;
        System.out.println(is_bleak(n));
    }
    public static int is_bleak(int n)
    {
        for(int i=n/2;i<n;i++){
            if(i+CountSetBits(i)==n){
                return 1;
            }
        }
        return 0;
        // Code here
    }
    static int CountSetBits(int a){
        int count=0;
        while(a!=0){
            if((a&1)==1){
                count++;
            }
            a=a>>1;
        }
        return count;
    }
}
