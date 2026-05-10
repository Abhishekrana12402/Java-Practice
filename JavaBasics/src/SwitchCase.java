import java.util.Scanner;

public class SwitchCase {

        /*public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            String fruit=input.next();
            switch (fruit) {
                case "mango"-> System.out.println("king of fruit");
                case "apple" -> System.out.println("an apple a day keeps doctor away");
                case "banana" -> System.out.println("rich in fibre and protien");
                case "grapes" -> System.out.println("small fruit");
                default -> System.out.println("please enter a valid fruit");

        }
    }

         */
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int EmpID=in.nextInt();
            String department=in.next();

            switch (EmpID){
                case 1:
                    System.out.println("abhishek rana");
                    break;
                case 2:
                    System.out.println("pradeep");
                    break;
                case 3:
                    System.out.println("emp no 3");

                    switch (department){
                        case "it":
                            System.out.println("it department" );
                            break;
                        case "management":
                            System.out.println("management department");
                            break;
                        default:
                            System.out.println("no department found");
                            break;
                    }
                    break;
                default:
                    System.out.println("enter valid EmpID");



            }
        }
}
