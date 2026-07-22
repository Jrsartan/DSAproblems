import java.util.*;
class fistlastOccurane{
    public void FindFistLast_occuran(int arr[],int ele){
        int len=arr.length;
        int first=-1;
        int last =-1;
        for(int i=0;i<len;i++){ 
            if(arr[i]==ele){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        System.out.println("Fist ans last element occure at the index in array: "+first+" "+last);
    }
}
public class firstLastOccurance {
       public static void main(String[] args){
        int arr[]={2,4,6,8,8,8,11,14,16,17};
        int target=16;
       fistlastOccurane occu = new fistlastOccurane();
       occu.FindFistLast_occuran(arr,target);
    }
    
}
