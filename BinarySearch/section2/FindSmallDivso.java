import java.util.*;
class fidnSmallDiv{
    public void SmallDiv(int arr[],int threshold){
        int maxele=Arrays.stream(arr).max().getAsInt();
        int len=arr.length;
        for(int devisor=1;devisor<=maxele;devisor++){
            int sum=0;
            for(int i=0;i<len;i++){
                sum+=(arr[i]+devisor-1)/devisor;
            }
            if(sum<=threshold){
                System.out.println("Is a smallest element of devisor: "+devisor);
                return;
            }
        }
    
        public int sumofDiv(int arr[],int div){
            int sum=0;
            int len=arr.length;
            for(int i=0;i<len;i++){
                sum+=(arr[i]+div-1)/div;
            }
            return sum;
        }
        public void OptimalSolMinDiv(int arr[],int threshol){
            int maxi=Arrays.stream(arr).max().getAsInt();
            int low=1;
            int high=maxi;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(sumofDiv(arr, mid)<=threshol){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            } 
                    System.out.println("Is a smallest element of devisor: "+low);
        }
}
public class FindSmallDivso {
    public static void main(String[] args){
      int ar[]={1,2,5,9};
      int thresh=6;
      fidnSmallDiv ele = new fidnSmallDiv();
      ele.SmallDiv(ar, thresh);
     ele.OptimalSolMinDiv(ar, thresh);
    }
}
