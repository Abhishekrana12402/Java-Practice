public class BleakOrNot {
    private static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }

    // Function to check if a number is Bleak
    public static boolean isBleak(int n) {
        for (int i = 1; i< n; i++) {
            if (i+ countSetBits(i) == n) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 3;
        if (isBleak(n)) {
            System.out.println(n + " is a Bleak number.");
        } else {
            System.out.println(n + " is not a Bleak number.");
        }
    }
}
