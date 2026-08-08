import java.util.*;
class MaxPoint{
    public void maxPoint(int arr[],int k){
        int  len=arr.length;
        int leftsum=0;
        int rightsum=0;
        int maxsum=0;
        for(int i=0;i<k;i++){
            leftsum+=arr[i];
        }
        maxsum=leftsum;
        int rindex=len-1;
        for(int i=k-1;i>=0;i--){
            leftsum-=arr[i];
            rightsum+=arr[rindex];
            rindex--;
            maxsum=Math.max(maxsum,leftsum+rightsum);
        }
        System.out.println(maxsum);
    }
}
public class maxpoinCard{
    public static void main(String[] args){
    int arrays[]={6,2,3,4,7,2,1,7,1};
    int k=4;
    MaxPoint mp = new MaxPoint();
    mp.maxPoint(arrays,k);
    }
}