import java.util.*;
class inverandCOund{
    public void Count_and_inver(int arr[]){
        int len=arr.length;
        int cnt=0;
        for(int i=0;i<len-1;i++){
            for(int j=i;j<len;j++){
                if(arr[i]>arr[j]){
                    cnt++;
                }
            }
        }
        System.out.println("Total Numbers of the Invers are:"+cnt);
    }
}
public class CountInver {
    public static void main(String[] args){
        int nums[]={2,3,7,1,3,5};
     inverandCOund inver = new inverandCOund();
     inver.Count_and_inver(nums);
    }
}
