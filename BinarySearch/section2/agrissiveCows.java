import java.util.*;
class noFcows{
    public boolean canwePlace(int arr[],int dist,int cows){
        int len=arr.length;
        int cntCows = 1;
        int last=arr[0];
        for(int i=0;i<len;i++){
            if(arr[i]-last>=dist){
                cntCows++;
                last=arr[i];
            }
        }
         if(cntCows>=cows){
                return true;
            }
            else{
               return false;
            }
    }
    public int Agris_Cows(int arrp[],int cows){
        Arrays.sort(arrp);
        int len=arrp.length;
         int low=0;
         int high=arrp[len-1]-arrp[0];
          while(low<=high){
            int mid=low+(high-low)/2;
            if(canwePlace(arrp, mid, cows)==true){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
          }
          return high;
    }
}
public class agrissiveCows {
    public static void main(String[] args){
       int array[]={1,2,3,4,5,6,7,8,9,10};
       int cow=4;
       noFcows co = new noFcows();
       int res = co.Agris_Cows(array, cow);
       System.out.print(res);
    }
}
