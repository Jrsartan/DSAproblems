import java.util.*;
class MissingElem {
  public void FindEle(int arr[]){
    int n=arr.length+1;
    int sum=n*(n+1)/2;
    //sum of arraya elements
    int arsum=0;
    for(int i=0;i<arr.length;i++){
        arsum+=arr[i];
    }
    System.out.println(sum);
    System.out.println(arsum);
    int missNo=sum-arsum;
    System.out.println("Missing number form the Arrya is:"+ missNo);
  }
  public void FindUsxor(int arr[]){
    int xor1=0;
    int xor2=0;
    for(int i=0;i<arr.length;i++){
    xor1=xor1^i;
    }
    for(int i=0;i<arr.length-1;i++){
        xor2=xor2^arr[i];
    }
    int miss=xor1^xor2;
    System.out.println("Missing term is:"+miss);
  }
}
public class MissNumArr {
    public static void main(String[] args) {
     int ar[]={1,2,3,4,6,7};
     MissingElem me = new MissingElem();
     me.FindEle(ar);
     me.FindUsxor(ar);
    }
}
