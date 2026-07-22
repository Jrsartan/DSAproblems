import java.util.*;
class FindNoFRota{
    public void noFRotation(int arr[]){
        int len=arr.length;
        int low=0;
        int high=len-1;
        int ans=Integer.MAX_VALUE;
        int index=-1;
        while(low<=high){
            if(arr[low]<=arr[high]){
                if(arr[low]<ans){
                index=low;
                ans=arr[low];
                }
                break;
            }
            int mid=low+(high-low)/2;
            if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    index=low;
                    ans=arr[low];
                }
                low=mid+1;
            }
            else{
                high=mid-1;
                if(arr[mid]<ans){
                    index=mid;
                    ans=arr[mid];
                }
            }
        }
        System.out.print("The array is rotated at the: "+index+ " Time!!");
    }
}
public class noOfRotation {
    public static void main(String[] args){
        int arr[]={4,5,6,7,0,1,2,3};
      FindNoFRota norota= new FindNoFRota();
      norota.noFRotation(arr);
    }
}
