import java.util.*;
class shipCap{
    public int dayscont(int arr[],int cap){
        int len=arr.length;
        int days=1;
        int load=0;
        for(int i=0;i<len;i++){
            if(load+arr[i]>cap){
                days+=1;
                load=arr[i];
            }
            else{
                load=load+arr[i];
            }
        }
        return days;
    }
    public void capacity(int arr[],int days){
            int maxi=Arrays.stream(arr).max().getAsInt();
            int sum=Arrays.stream(arr).sum();
            for(int cap=maxi;cap<=sum;cap++){
                int daysrequr=dayscont(arr, cap);
                if(daysrequr<=days){
                    System.out.println("minimum capacity of the ship is:"+cap);
                    return;
                }
            }
    }
}
public class CapShipPackDay {
    public static void main(String[] args){
       int weight[]={1,2,3,4,5,6,7,8,9,10};
       int days=3;   
       shipCap ship = new shipCap();
       ship.capacity(weight, days);
    }
}
