package java_part_2.Interfaces;

public interface Engine {
    int Price = 10000;
    default void start(){
        System.out.println("Hii");
    }
    void stop();
    void accelerate();

}
