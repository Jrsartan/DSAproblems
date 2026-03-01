import java.io.*;

public class construtor {
    int num1;
    int num2;
    construtor(){
            System.out.println("THis is defoult constructor!");
        }
    construtor(int n1,int n2){
        this.num1=n1;
        this.num2=n2;
    }
     void disp_add(){
          int res;
          res=num1+num2;
          System.out.println("result is:"+res);
     }
    public static void main(String[] args) {
        construtor sc1=new construtor();
        construtor sc=new construtor(44,56);
        sc.disp_add();
 
    }
}
