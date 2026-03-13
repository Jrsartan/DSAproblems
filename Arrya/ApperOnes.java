import java.util.*;
class OnesApper{
    public void appersone(int arr[]){
        for(int i=0;i<arr.length;i++){
             int cnt=0;
            int num=arr[i];
        for(int j=0;j<arr.length;j++){
            if(arr[j]==num){
                cnt++;
            }
        }
        if(cnt==1){
            System.out.println(num+" Appers numbere only ones!");
        }
    }
}
    public void usingxor(int arr[]){
        int xor1=0;
        for(int i=0;i<arr.length;i++){
            xor1=xor1^arr[i];
        }
        System.out.println("The number is appers only ones is:"+xor1);
    }  
}
public class ApperOnes {
    public static void main(String[] args) {
        int arrr[]={1,2,2,3,1,5,8,5,6,9,8,3,6};
        OnesApper one=new OnesApper();
        one.appersone(arrr);
        one.usingxor(arrr);
    }
}
