package weak3;
import java.io.*;
import java.io.*;

public class Numbers {
     private int a;
     private int b;
     public void setA(int a){
        this.a=a;
     }
     public void setB(int b){
        this.b=b;
     }
     public void sum(){
        System.out.println(a+b);
     }
     public void sub(){
        System.out.println(a-b);
        
}
public static void main(String[] args) {
     Numbers sb=new Numbers();
     sb.setA(4);
     sb.setB(5);

     sb.sum();
     sb.sub();
  }
}

