import java.util.*;
class buyandseal{
    public void Buy_Seal(int arr[]){
    int mini=arr[0];
    int profit=0;
    for(int i=0;i<arr.length;i++){
        int cost=arr[i]-mini;
        profit=Math.max(profit, cost);
        mini=Math.min(mini, arr[i]);
     }
     System.out.println("Seal at the prize of the:"+profit);
    }
}
public class BuySeal {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        buyandseal b = new buyandseal();
        b.Buy_Seal(arr);
    }
}
