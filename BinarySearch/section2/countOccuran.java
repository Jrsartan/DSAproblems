import java.util.*;
class count_Occu_no{
    public void calculateOccuran(int arr[],int target){
        int len=arr.length;
        int cnt=0;
        for(int i=0;i<len;i++){
            if(arr[i]==target){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
public class countOccuran {
    public static void main(String[] args) {
        int arrr[]={0,0,1,1,1,1,3,4,5,6,3,6,1};
        int target=1;
        count_Occu_no count = new count_Occu_no();
        count.calculateOccuran(arrr, target);
    }
}
