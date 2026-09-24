package java_part_2.Interfaces;

public class MediaCd implements Media{
    @Override
    public void start() {
        System.out.println("Media player start");
    }

    @Override
    public void stop() {
        System.out.println("Media player stops");
    }
}
