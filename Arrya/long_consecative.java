import java.util.*;
import java.math.*;
class consecative{
    public void long_cons(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int max_len=0;
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i]-1)){
                int current=arr[i];
                int cnt=1;

                while (set.contains(current+1)) {
                    current++;
                    cnt++;
                }
                max_len=Math.max(max_len, cnt);
            }
        }
        System.out.print("Longest COnsecutive length is:"+max_len);
    }
}
public class long_consecative {
    public static void main(String args[]){
       int arr[]={101,100,1,2,3,4,102,105};
       consecative con = new consecative();
       con.long_cons(arr);
    }
}
