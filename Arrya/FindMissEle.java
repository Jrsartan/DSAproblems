public class FindMissEle {
   public static void main(String[] args) {
    int arr[]={1,2,3,5,6,7,8,9};
    int j=0;
    for(int i=0;i<arr.length;i++){
        if(arr[j]!=i){
            System.out.print(i);
        }
        j++;
    }
   } 
}
