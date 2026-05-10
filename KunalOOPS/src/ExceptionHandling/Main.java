package ExceptionHandling;
public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
//divide(a,b);
           // int c=a/b;
            String name="Abhishek";
            if(name.equals("Abhishek")){
                throw new MyException("Name cannot be taken");
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());

        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("normal exception ");
        }
        // we always have to write the normal exceptions below the important ones because every exception is included in normal Execution hence it will not allow further any type of execution to run hence will give an error
        finally {
            System.out.println("this is always run");//it will always run
        }
    }
    static int divide(int a,int b)throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Please try to change the divisor");
        }
        return a/b;
    }
    // if the denominator is zero. The exception is caught by the except block, which prints an error message instead of letting the program terminate abruptly.
}
