class MaxOne{
    public int CountMaxOne(int arr[]){
        int maxi=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                cnt++;
                maxi=Math.max(maxi, cnt);
            }
            else{
                cnt=0;
            }
        }
        return maxi;
    }
}
public class consonemaxT {
    public static void main(String[] args) {
        int nums[]={1,0,1,1,1,0,1,1,0,0};
        MaxOne mx= new MaxOne();
       System.out.println(mx.CountMaxOne(nums));
    }
}
