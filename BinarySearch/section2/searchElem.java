import java.util.*;
class rotatelementSearch{
    public void searchElement(int arr[],int target){
        int len=arr.length;
        int low=0;
        int high=len-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                System.out.println("No.Found at the location:"+mid);
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
             System.out.println("NO. is not found!!");
         }
    }
}
public class searchElem {
    public static void main(String[] args){
       int ar[]={7,8,1,2,3,4,5,6};
       int target=1;
       rotatelementSearch serach = new rotatelementSearch();
       serach.searchElement(ar,target);
    }
}