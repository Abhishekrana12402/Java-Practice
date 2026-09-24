package java_part_2.Interfaces;

public interface Media {
    default void start(){
        System.out.println("Hii");
    }
    void stop();
}
