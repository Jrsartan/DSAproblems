import java.util.*;
interface vehical{
    void changeGear(int a);
    void changeUp(int a);
    void appBreaks(int a);
}
class Bicycle implements vehical{
    int speed;
    int gear;
    @Override
    public void changeGear(int newGear){
        gear=newGear;
    }
    @Override
    public void changeUP(int increamet){
        speed =speed+increamet;
    }
    @Override
    public void appBreaks(int decreamet){
       speed=speed-decreamet;
    }
    public void printState(){
        System.out.println("speed:"+speed+"Gear: "+gear );
    }
}
class Bike implements vehical {
    
    int speed;
    int gear;
    
    // Change gear
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }
    
    // Increase speed
    @Override
    public void changeUp(int increment){
        speed = speed + increment;
    }
      @Override
    public void appBreaks(int decrement){
        speed = speed - decrement;
    }
    
    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
    
}


public class interfacexamp {
    public static void main(String[] args) {
       Bicycle bi =new Bicycle();
       bi.changeGear(4);
       bi.changeUP(6);
       bi.appBreaks(5);
       System.out.println("Bicycle present state:");
       bi.printState();
       Bike b= new Bike();
       b.changeGear(5);
       b.changeUp(6);
       b.appBreaks(3);
       System.out.println("Bike present state:");
       b.printStates();

    }
}
