package Interface;

public interface Brakes {
    void brake();
//    static interface methods should always have a body
    //static void greeting(); this is incorrect
    //Correct Way:
    static void greeting(){
        System.out.println("Hello");
    }
}
