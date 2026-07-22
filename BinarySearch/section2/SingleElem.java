import java.util.*;
class findTheSigElem{
    public void SingElem(int arr[]){
        int len=arr.length;
         if(len==1){
            System.out.print(arr[0]);
         }
         if(arr[0]!=arr[1]){
            System.out.print(arr[0]);
         }
         if(arr[len-1]!=arr[len-2]){
            System.out.print(arr[len-1]);
         }
         int low=1;
         int high=len-2;
         while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                System.out.print("There is Single element in array is: "+arr[mid]);
            }
            if((mid%2==1) && arr[mid-1]!=arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        
public class SingleElem {
    public static void main(String[] args){
         int arr[]={3,3,4,5,5,6,6,7,7};
         findTheSigElem singELe = new findTheSigElem();
         singELe.SingElem(arr);
    }
}
