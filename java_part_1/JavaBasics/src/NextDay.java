
import java.util.Scanner;
public class NextDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = in.nextInt();
        System.out.println("Enter the month");
        int month = in.nextInt();
        System.out.println("Enter the day");
        int day = in.nextInt();
        if (year % 4 == 0) {
            Leap(year, month, day);
        }
        if (year % 4 != 0) {
            if (month == 2 && day == 28) {
                day = 1;
                month++;
                System.out.println("Next day will be:");
                System.out.println(year+" ");
                System.out.println(month+" ");
                System.out.println(day+" ");
            }
            else {
                Leap(year, month, day);
            }
        }
    }
    static void Leap(int y, int m, int d) {
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d == 31 && m == 12) {
                d = 1;
                m = 1;
                y++;
            } else if (d == 31) {
                d = 1;
                m++;
            } else d++;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d == 30) {
                d = 1;
                m++;
            } else d++;
        } else if (m == 2) {
            if (d == 29) {
                d = 1;
                m++;
            } else d++;
        }
        System.out.println("Next day will be:");
        System.out.println(y+" ");
        System.out.println(m + " ");
        System.out.println(d + " ");
    }
}


