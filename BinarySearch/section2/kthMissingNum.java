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
}
public class kthMissingNum {
     public static void main(String[] args){
        int ar[]={2,3,4,7,11};
        int k=5;
        kth_Miss_num kth = new kth_Miss_num();
        int res= kth.KthMissingNum(ar, k);
        System.out.print(res);
     }
}
