import java.util.*;

class Std{
 public int roll_no;
    public String name;

    Std(int r_no,String n){
        this.roll_no=r_no;
        this.name=n;
    }
}

public class Arraynonprim {
   public static void main(String[] args){
    Std[] arr;
    arr=new Std[5];
    arr[0]= new Std(1,"Spartan");
    arr[1]= new Std(2,"Vaibhav");
    arr[2]= new Std(3,"Varun");
    arr[3]= new Std(4,"Abhay");
    arr[4]= new Std(5,"Pawan");
       
     for(int i=0;i<5;i++){
        System.out.println("At index: "+i+" Student Roll No. is "+arr[i].roll_no+" And Name is:"+arr[i].name);
     }
     System.out.println("At index 3 Roll no is: "+arr[3].roll_no+" and Name is:"+arr[3].name);
  }
}

