import java.util.*;
public class Strin_Buffer{
    public static void main(String[] args){
         StringBuffer s= new StringBuffer();
         //1st prob
         s.append("Hello");
         s.append(" ");
         s.append("Spartan");
         String str=s.toString();
         System.out.print(str);
          //2nd prob
          StringBuffer sb1=new StringBuffer();
          sb1.append(str);
          System.out.println( "Defoult Construtor:"+sb1);
          StringBuffer sb2=new StringBuffer(50);
          sb2.append("Java Programing");
          System.out.println("With Capcity 50:"+sb2);

          StringBuffer sb3=new StringBuffer("Welcome");
          sb3.append("to Java");
          System.out.println("With String "+sb3);

          //Insert() method in java
          StringBuffer sb4 = new StringBuffer("Hello ");
          sb4.insert(6,"Spartan");
          System.out.println(sb4);
          
          //replace() method
          StringBuffer sb5=new StringBuffer("I'am Spartan");
          sb5.replace(5,12, "Vaibhav");
          System.out.println(sb5);
          //delete() method
          sb5.delete(5,12);
          System.out.println(sb5);
          //revers() method
          StringBuffer sb6=new StringBuffer("Spartan");
          sb6.reverse();
          System.out.println(sb6);
          //capacity() method defoult 16 
          System.out.println(sb6.capacity());
          sb6.append("Hello");
          System.out.println(sb6.capacity());
          sb6.append("I'am Sparatn & I love Java");
          System.out.println(sb6.capacity());
    }
}
