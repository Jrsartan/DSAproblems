import java.util.*;
class SortElemet{
    public void sortEle(int arr[]){
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                cnt0++;
            }
            else if(arr[i]==1){
                cnt1++;
            }
            else{
                cnt2++;
            }
        }
        for(int i=0;i<cnt0;i++){
            arr[i]=0;
        }
        for(int i=cnt0;i<cnt0+cnt1;i++){
            arr[i]=1;
        }
        for(int i=cnt0+cnt1;i<cnt0+cnt1+cnt2;i++){
            arr[i]=2;
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }
}
public class sort123 {
    public static void main(String[] args) {
        int ar[]={0,0,2,1,2,1,0,1,0,2,1,2};
        SortElemet so = new SortElemet();
        so.sortEle(ar);
    }
}
