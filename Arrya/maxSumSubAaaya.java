import java.util.*;
class maxSum_Array{
    public void maxsum_SubArr(int arr[]){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                maxi=Math.max(sum,maxi);
            }
        }
        System.out.println("Maximum sum of the subarray is:"+maxi);
    }
    public void max_opti_sol(int arr[]){
         long sum = 0;
    long maxi = Long.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxi){
               maxi = sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("maximun sum is:"+maxi);
    }
}
public class maxSumSubAaaya{
    public static void main(String[] args) {
        int arr[]={-2,-1,2,-3,4};
        maxSum_Array m = new maxSum_Array();
        m.maxsum_SubArr(arr);
        m.max_opti_sol(arr);
    }
}