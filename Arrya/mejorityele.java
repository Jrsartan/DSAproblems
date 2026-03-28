import java.util.*;
import java.util.HashMap;
class majorele {
    public void findmejele(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    cnt++;
                }
            }
            // Check AFTER counting
            if (cnt > arr.length / 2) {
                System.out.println("Majority element: " + arr[i]);
                return; // stop after finding
            }
        }
        System.out.println("No majority element found");
    }
    // public void mejhashmap(int arr[]){
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     for(int i=0;i<arr.length;i++){
    //         if(map.containsKey(arr[i])){
    //             map.put(map.get(arr[i]+1),arr[i]);
    //         }
    //         else {
    //             map.put(arr[i], 1);
    //         }
    //     }
    //      System.out.println(map);
    //      for(int val : arr){
    //     System.out.print(val+" ");
    //   }
    // }
    public void mejhashmap(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i], 1);
            }
         } 
         System.out.println(map);
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
        if(e.getValue()>arr.length/2){
            System.out.println(e.getKey());
        } 
    }
  }
}
public class mejorityele {
    public static void main(String[] args) {
        int arr[] = {1,2,4,1,1,2,1,1,7,1};

        majorele m = new majorele();
        m.findmejele(arr);
        m.mejhashmap(arr);
    }
}