import java.io.*;

public class copy_con {
   int num1;
   int num2;
   copy_con(int n1,int n2){
     num1=n1;
     num2=n2;
   }
   copy_con(copy_con s){
    num1=s.num1;
    num2=s.num2;
   }
   void disp(){
    System.out.println(num1+num2);
   }
   public static void main(String[] args) {
    copy_con s1=new copy_con(123,45);
    copy_con s2=new copy_con(s1);//passing data as parameter
    s1.disp();
    s2.disp();
   }
    
}