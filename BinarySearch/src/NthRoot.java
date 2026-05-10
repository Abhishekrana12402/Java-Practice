public class NthRoot {
    public static void main(String[] args) {
        int start=0;
        int x=36;int end=x;
//        System.out.println(FindSquareRoot(0,x,x));
        System.out.println(FindNthroot(4,16));
    }
//    static int FindSquareRoot(int start,int end,int x){
//        while (start<=end){
//            int mid=start+(end-start)/2;
//            if(mid*mid==x){
//                return mid;
//            } else if (mid*mid>x) {
//                end=mid-1;
//            }
//            else {
//                start=mid+1;
//            }
//        }
//        return end;
//    }
    static int FindNthroot(int n,int m){
        int start=0;
        int end=m;
        while (start<=end){
            int mid=start+(end-start)/2;
            int ans= CheckCondition(mid,n,m);
            if(ans==1){
              return mid;
            }
            else if(ans==2){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
    static int CheckCondition(int mid,int n,int m){
        int temp=1;
        for(int i=1;i<=n;i++ ){
            temp=temp*mid;
            if(temp>m){
                return 2;
            }
        }
        if(temp==m){
            return 1;
        }
        return 0;
    }
}
