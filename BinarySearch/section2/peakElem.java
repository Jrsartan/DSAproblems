import java.util.*;
class FindthePeak{
    public void FindThe_peakElem(int arr[]){
        int len=arr.length;
        for(int i=0;i<len;i++){
        if((i==0) || (arr[i-1]<arr[i]) && (i==len-1) || arr[i]>arr[i+1]){
            System.out.println("The Peak Elemetn in arrya is: "+arr[i]);
        }
    }
  } 
  public void Using_BinSear(int arr[]) {

    int len = arr.length;

    if (len == 1) {
        System.out.println("Peak Element: " + arr[0]);
        return;
    }

    if (arr[0] > arr[1]) {
        System.out.println("Peak Element: " + arr[0]);
        return;
    }

    if (arr[len - 1] > arr[len - 2]) {
        System.out.println("Peak Element: " + arr[len - 1]);
        return;
    }

    int low = 1;
    int high = len - 2;

    while (low <= high) {

        int mid = low + (high - low) / 2;

        if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
            System.out.println("Peak Element: " + arr[mid]);
            return;
        }

        if (arr[mid] < arr[mid + 1]) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
}
}
public class peakElem {
    public static void main(String[] args){
        int arr[]={1,2,3,5,4,5,6,10,9};
        FindthePeak peak = new FindthePeak();
       // peak.FindThe_peakElem(arr);
        peak.Using_BinSear(arr);
    }

}
