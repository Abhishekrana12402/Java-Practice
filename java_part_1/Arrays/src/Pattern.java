import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int val=1;boolean toggle=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++) {
                if(toggle&&val<=9){
                    System.out.print(val+" ");
                    val++;
                    continue;
                }
                toggle=false;


                    if(val==10){
                        System.out.print(0+" ");
                        val=0;
                    }
                    else{
                        System.out.print(9+" ");
                        val=10;
                    }
                }

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        val=1;toggle=true;
        for (int i = n - 1; i >= 0; i--) {
            // Print leading spaces to shift the numbers to the right
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print the values from right to left
            for (int j = n - i; j > 0; j--) {
                if (toggle && val <= 9) {
                    System.out.print(val + " ");
                    val++;
                    continue;
                }
                toggle = false;

                if (val == 10) {
                    System.out.print(0 + " ");
                    val = 0;
                } else {
                    System.out.print(9 + " ");
                    val = 10;
                }
            }
            //  System.out.println();

//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
            System.out.println();
        }

    }
}
