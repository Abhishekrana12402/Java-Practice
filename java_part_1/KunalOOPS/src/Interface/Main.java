package Interface;

public class Main {
    public static void main(String[] args) {
        Cars  car=new Cars();
//        car.accelerate();
//        car.brake();
//        car.stops();
//        car.start();
//        Media carMedia=new Cars() ;
//        carMedia.stop();
//        carMedia.start();
        NiceCar Car=new NiceCar();
        Car.startMusic();
        Car.start();
        Car.upgradeEngine();
        Car.start();
        Main obj=new Main();
       // obj.greeting(); this cannot be done since greeting method is static hence we have to call it by Interface name
        //A class can implement multiple interfaces, which allows it to inherit and provide the functionality specified by each interface. This enables a class to exhibit different behaviors or fulfill multiple roles as required.
Brakes.greeting();
    }
}
