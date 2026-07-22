import java.util.*;
class lowerBoundFind{
public void findLowerBoudn(int arr[],int target){
    int len=arr.length;
    int low=0;
    int high=len-1;
    int ans=len;
    while(low<=high){
        int mid=low+(high-low)/2;
      if(arr[mid]>=target){
          ans=mid;
          low=mid+1;
      }
      else{
        high=mid-1;
      }
    }
    System.out.print("uper Bounds founds at:"+ans);
   }
}
public class uperBounds {
    public static void main(String[] args){
        int arr[]={1,2,3,3,5,8,8,10,10,11};
        int taget=9;
        lowerBoundFind lower = new lowerBoundFind();
        lower.findLowerBoudn(arr, taget);
    }
}
