import java.util.*;
import java.math.*;
class calculatMaxiSubArr{
    public void MaximumsubArr(int arr[]){
        
        int max=Integer.MIN_VALUE;
        int len=arr.length;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                int prod=1;
                for(int k=i;k<=j;k++){
                    prod=prod*arr[k];
                    max=Math.max(max,prod);
                }
            }
        }
        System.out.println("maximun product of the sub array is:"+max);
    }
    public void MaximusubArrOptimalsol(int arr[]){
        int len=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            int prod=1;
            for(int j=i;j<len;j++){
                prod=prod*arr[j];
                max=Math.max(max,prod);
            }
        }
                System.out.println("maximun product of the sub array is:"+max);
    }
    public void BetterSolution(int ar[]){
        int len= ar.length;
        int prifix=1;
        int sufix=1;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(prifix==0){
                 prifix=1;
            }
            if(sufix==0){
                prifix=1;
            }
            prifix=prifix*ar[i];
            sufix=sufix*ar[len-i-1];
            maxi=Math.max(maxi,Math.max(prifix,sufix));
        }
         System.out.println("maximun product of the sub array is:"+maxi);
    }
}
public class maxisubarr {
    public static void main(String[] args){
         int arr[]={2,0,3,-2,4};
         calculatMaxiSubArr subarr = new calculatMaxiSubArr();
         subarr.MaximumsubArr(arr);
         subarr.MaximusubArrOptimalsol(arr);
         subarr.BetterSolution(arr);
    }
}
