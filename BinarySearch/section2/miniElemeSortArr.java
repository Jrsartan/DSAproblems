import java.util.*;
class FindMiniEle{
    public void MiniElementRottArr(int arr[]){
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("The minimum element in array is:"+arr[i+1]);
            }
        }
    }
    public void optimalsolBinSer(int arr[]){
        int len= arr.length;
        int low=0;
        int high=len-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            if(arr[low]<=arr[high]){
                ans=Math.min(ans, arr[low]);
                break;
            }
            int mid= low+(high-low)/2;
            if(arr[low]<=arr[mid]){
                ans=Math.min(ans,arr[low]);
                low=mid+1;
            }
            else{
                ans=Math.min(ans, arr[mid]);
                 high=mid-1;
            }
        }
        System.out.println("The minimum element is rotet sorted array:"+ans);
    }
}
public class miniElemeSortArr {
    public static void main(String[] args){
        int arr[]={4,5,6,7,0,1,2,3};
        FindMiniEle ele = new FindMiniEle();
        ele.MiniElementRottArr(arr);
        ele.optimalsolBinSer(arr);
    }
}
