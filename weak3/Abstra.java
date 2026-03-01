import java.util.*;
 abstract class Tv {
  abstract void turnOff();
  abstract void turnOn();
    
}
class TvRemot extends Tv{
  @Override
   void turnOn(){
    System.out.println("Tv is TurnOn!");
   }
   @Override 
    void turnOff(){
      System.out.println("Tv is TurnOff!");
    }
}
public class Abstra {
    public static void main(String[] args) {
      Tv rem = new TvRemot();
      rem.turnOn();
      rem.turnOff();
    }
}
