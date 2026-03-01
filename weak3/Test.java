import java.util.*;
 class Math_poly {
   int n1;
   int n2;
   int add(int num1,int num2){
    this.n1=num1;
    this.n2=num2;
    return n1+n2;
   }
}
 class Arithmat extends Math_poly {
  // @Override
    int add(int m1,int m2){
        this.n1=m1;
        this.n2=m2;
        return n1+n2;
    }
    
}
 public class Test{
    public static void main(String[] args) {
        Math_poly m = new Math_poly();
        Math_poly m1 = new Arithmat();
       System.out.println( m.add(40,50));
       System.out.println(m1.add(50,60));
    }
} 