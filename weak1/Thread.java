public class Thread {
    public void run(){
       System.out.println("Thread is created!!");
    }
}
public class  ThredProg {
  public static void main(String[] args){
    Thread tr = new Thread();
    tr.start();
  }
    
}
