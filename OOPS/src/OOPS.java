

public class OOPS {
    public static void main(String[] args) {
        Pen P1 = new Pen();
        P1.SetColour("Blue");
        System.out.println(P1.getColour());
        P1.SetTip(5);
        System.out.println(P1.getTip());
//        BankAccount myAcc = new BankAccount();
//        myAcc.Username = "Abhishek";
//        System.out.println(myAcc.Username);
        // we cannot get or change password by myAcc.Password as it is in private

    }
}


//    class BankAccount {
//        public String Username;
//        private String Password;
//
//        public void SetPassword(String S) {
//            Password = "S";
//        }

        class Pen {
            //properties and function
            private String Colour;
            private int tip;

            void SetColour(String NewColour) {
                Colour = NewColour;
            }

            String getColour() {
                return this.Colour;
            }

            void SetTip(int NewTip) {
                tip = NewTip;
            }

            int getTip() {
                return this.tip;
            }
        }








