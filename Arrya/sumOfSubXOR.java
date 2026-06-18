import java.util.*;
public class sumOfSubXOR {
    public static void main(String[] args){
        int arr[]={4,2,8,6,2,4,8};
        int k=6;
        int cnt=0;
        int xor=0;
        int len=arr.length;
        // for(int i=0;i<len;i++){
        //     for(int j=i;j<len;j++){
        //        int XOR=0;
        //        XOR^=arr[j];
        //        if(XOR==k){
        //           cnt++;
        //        }
        //     }
        // }
        // System.out.println("No.of SubArray XOR is:"+ k +" are:"+cnt);
        HashMap<Integer,Integer> map = new HashMap<>();
map.put(xor, map.getOrDefault(xor, 0) + 1);       
 for(int i=0;i<len;i++){
            xor=xor^arr[i];
            int x=xor^k;
              cnt = cnt + map.getOrDefault(x, 0);
map.put(xor, map.getOrDefault(xor, 0) + 1);        }
        System.out.println("No. of time its sub Array:"+cnt);

    }
}
