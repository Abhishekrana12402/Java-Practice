package java_part_2.Singleton;

public class Singleton {
    public Singleton() {
    }
    private static Singleton instance;
    static Singleton getInst(){
        if (instance == null){
            instance = new Singleton();
        }
        return  instance;
    }
}
