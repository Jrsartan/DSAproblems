import java.util.*;
interface testInterfaace{
    final int a=10;
    void despla();
}
class testClass implements testInterfaace{
    public void despla(){
        System.out.println("Spartan is hear!");
    }
}
class  interface_ex {
public static void main(String[] args){
    testClass t = new testClass();
    t.despla();
    System.out.println(t.a);
  }
}