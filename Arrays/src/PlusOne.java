import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits={9,9};

        int n=digits.length;
        if(digits[n-1]!=9){
            digits[n-1]+=1;
            System.out.println(Arrays.toString(digits));
            return;
        }
        int j=n-1;
        while(j>0&&digits[j]==9){
            digits[j]=0;
            j--;
        }
        if(j>=0&digits[j]!=9){
            digits[j]+=1;
            System.out.println(Arrays.toString(digits));
            return;
        }
        else{
            int[] ans=new int[n+1];
            ans[0]=1;
            for(int i=1;i<=n;i++){
                ans[i]=0;
            }
            System.out.println(ans);
        }

    }
}
