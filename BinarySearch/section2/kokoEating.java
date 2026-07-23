import java.util.*;
class kokoEatingBanana{
    public int NoFHour(int arr[],int hours){
        int total_hrs=0;
        int len=arr.length;
        for(int i=0;i<len;i++){
            total_hrs+=(arr[i] + hours - 1) / hours;;
        }
        // System.out.println(total_hrs);
        return total_hrs;
    }
    public void EatKokoBan(int arr[],int h){
     int len=arr.length;
     int low=1;
     int high = Arrays.stream(arr).max().getAsInt();
     int ans=Integer.MIN_VALUE;
     while(low<=high){
        int mid= low+(high-low)/2;
        int total_hrs=NoFHour(arr, mid);
        if(total_hrs<=h){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
     }
       System.out.println("Mini Banala Can eat per hr:"+ans);

    }
}
public class kokoEating {
    public static void main(String[] args){
           int arr[]={3,6,7,11};
           int n=8;
           kokoEatingBanana eat = new kokoEatingBanana();
           eat.EatKokoBan(arr, n);
    }
}
