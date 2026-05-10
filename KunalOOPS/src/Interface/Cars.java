package Interface;

public class Cars implements Engine,Brakes,Media{


    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }
    //Suppose any method is overridden in subclass then its access moifier(private public etc) should be better than once used in parent class For example in parent class
    //method is public void greeting then in subclass we cannot do private void greeting (nothing less restrictive should be used)


    @Override
    public void start() {
        System.out.println("I start engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a normal car");
    }
    //Interface to Interface we use extends whereas Classes to Interface we use implements
}
