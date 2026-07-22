import java.util.*;
class duplicatElem{
    public void Duplicat(int arr[],int target){
        int len=arr.length;
        int low=0;
        int high=len-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target)
                System.out.print("Is an duplicate number:"+ arr[mid]);
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }    
            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<=target && target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
          System.out.print("There is not a duplicate element in array!");
    }
}
public class FIndDuplicat {
    public static void main(String[] args){
        int arr[]={3,3,1,2,3,3,3,3,3};
        int target=3;
        duplicatElem duplic= new duplicatElem();
        duplic.Duplicat(arr, target);
    }
}
