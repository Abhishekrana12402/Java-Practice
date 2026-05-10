public class FindNumberThatAppearsOnlyOnce {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4};
        int Xor=0;
        for (int i=0;i<arr.length;i++){
            Xor=Xor^arr[i];
        }
        System.out.println(Xor);
    }
}
