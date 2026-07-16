import java.util.*;
class binSear{
    public int BinarySearch(int arr[],int target){
        int len=arr.length;
        int low=0;
        int high=len-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                System.out.println("The number is found at the location:"+mid);
                return mid;
            }
            else if(target>=arr[mid]){
                low=mid+1;
            }
            else{
                high=high-1;
            }
        }
        System.out.print("Number is not in array!");
        return -1;
    }
    public int RecursionSol(int arr[],int low,int high,int target){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target>arr[mid]){
            return  RecursionSol(arr, mid+1, high, target);
        }
        else{
            return RecursionSol(arr, low,mid-1, target);
        }
    }
}
public class binarySearch_1 {
    public static void main(String[] args){
         int arr[] = {3,4,5,6,7,8,9,12,15,16,17,18,20};
        int tar = 15;
        int high=arr.length-1;
        int low=0;
       binSear bin = new binSear();
       bin.BinarySearch(arr,tar);
       int result=bin.RecursionSol(arr, low, high, tar);
       System.out.println("Number is found at the location of the:"+result);
    }
}
