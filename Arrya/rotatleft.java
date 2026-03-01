public class rotatleft {
    public static void main(String[] args) {
        int arr[]={51,65,58,66,71,20,45};
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
              arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
     for(int j=0;j<=arr.length;j++){
         System.out.print("["+arr[j]+"]");
     }
    }
}
