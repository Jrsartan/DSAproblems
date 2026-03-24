import java.util.*;
class SumOfTwo{
    public void towelemsum(int arr[],int target){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+arr[j]==target){
                System.out.println(i+" & "+j);
                break;
            }
        }
        j++;
    }
}
public class towSum {
 public static void main(String[] args) {
    int array[]={10,25,6,4,9,21,5};
    SumOfTwo su = new SumOfTwo();
    su.towelemsum(array, 31);
 }   
}
