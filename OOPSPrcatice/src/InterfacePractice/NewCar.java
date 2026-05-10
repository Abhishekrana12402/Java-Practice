package InterfacePractice;

public class NewCar {
    private Engine engine;
    Media player=new CDPlayer();
    public NewCar(){
        engine=new PowerEngine();
    }

    public NewCar(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stops(){
        engine.stop();
    }public void accelerates(){
        engine.accelerate();
    }

   public void startMusic(){
        player.start();
   }
   public void stopsMusic()
   {
       player.stop();
   }
   public void UpgradeEngine(){
        this.engine=new ElectricEngine();
   }
}
