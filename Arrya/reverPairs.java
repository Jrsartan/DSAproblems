class findPairsRever{
    public void NofReversPairs(int arr[]){
        int len=arr.length;
        int cnt=0;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]>2*arr[j]){
                    cnt++;
                }
            }
        }
        System.out.println("No. of the ReversPairs are:"+cnt);
    }
}
public class reverPairs{
    public static void main(String[] args){
      int nums[]={40,25,19,12,9,6,2};
      findPairsRever revers = new findPairsRever();
      revers.NofReversPairs(nums);
    }
}