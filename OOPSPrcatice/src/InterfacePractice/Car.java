package InterfacePractice;

public class Car implements Engine,Media,Brake{
    @Override
    public void brake() {
        System.out.println("'applies brake");
    }

    @Override
    public void start() {
        System.out.println("Cars start");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");

    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerates");
    }
}
