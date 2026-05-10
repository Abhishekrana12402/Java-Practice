import java.util.Scanner;

public class CustomHash {
    private static final int HASH_LENGTH = 8; // Desired length of the hash

    private static int customHash(String input) {
        final int prime = 31;
        final int mod = 1000000007; // A large prime number

        int hash = 0;
        int power = 1;

        for (char c : input.toCharArray()) {
            hash = (hash + (c - 'a' + 1) * power) % mod; // Convert character to integer value and add to hash
            power = (power * prime) % mod; // Update power using modular arithmetic
        }

        // Truncate or pad the hash to ensure it's of fixed length
        return hash % ((int) Math.pow(10, HASH_LENGTH));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the message to hash: ");
        String message = scanner.nextLine();

        int hashValue = customHash(message);
        System.out.println("Hash value of '" + message + "': " + hashValue);
    }
}
