import java.util.*;
class decentnum{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number!");
    int num=sc.nextInt();
    int sum=0;
    for(int i=1;i<=num/2;i++){
        if(num%i==0){
        sum+=i;
        }
    }
    System.out.println("Sum of all number is: " +sum);
    if(num>sum){
        System.out.println("Number is "+num+" aboundent number");
    }
    else{
        System.out.println("Number is " +num+" deceent number");
     }
  }
}