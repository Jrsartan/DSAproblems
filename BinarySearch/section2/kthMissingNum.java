class kth_Miss_num{
    public int KthMissingNum(int arr[],int k){
        int len=arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]<=k){
                k++;
            }
            else{
                break;
            }
        }
        return k;
    }
    public int BinarySearch(int arr[],int k){
        int len=arr.length;
        int low=0;
        int high=len-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int missing = arr[mid]-(mid+1);
            if(missing<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return k+high+1;
    }
}
public class kthMissingNum {
     public static void main(String[] args){
        int ar[]={2,3,4,7,11};
        int k=5;
        kth_Miss_num kth = new kth_Miss_num();
        int res= kth.KthMissingNum(ar, k);
        int result= kth.BinarySearch(ar,k);
        System.out.println(res);
        System.out.print(result);
     }
}
