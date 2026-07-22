import java.util.*;
class lowerBoundFind{
public void findLowerBoudn(int arr[],int target){
    int len=arr.length;
    int low=0;
    int high=len-1;
    int floor=-1;
    int celing=-1;
    while(low<=high){
        int mid=low+(high-low)/2;
      if(arr[mid]==target){
          floor=arr[mid];
          celing=arr[mid];
          break;
      }
      else if(target>arr[mid]){
        floor=arr[mid];
        low=mid+1;
      }
      else{
        celing=arr[mid];
        high=mid-1;
      }
    }
    System.out.println("floor will be at :"+floor);
    System.out.println("Celing will be at :"+celing);
   }
}
public class floorandCoil {
    public static void main(String[] args){
        int arr[]={1,2,3,3,5,8,8,10,10,11};
        int taget=9;
        lowerBoundFind lower = new lowerBoundFind();
        lower.findLowerBoudn(arr, taget);
    }
    
}
