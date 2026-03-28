import java.util.*;
import java.util.HashMap;
class majorelm{
    public void majorHash(int arr[]){
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<arr.length;i++){
          if(map.containsKey(arr[i])){
              map.put(arr[i],map.get(arr[i])+1);
          }
          else{
            map.put(arr[i],1);
          }
       }
       System.out.println(map);
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
        if (e.getValue() > arr.length / 2) {
            System.out.println("Majority element: " + e.getKey());
        }
       }
    }
   public void majorelem(int arr[]) {
    int cnt = 0;
    int ele = 0;
    for (int i = 0; i < arr.length; i++) {
        if (cnt == 0) {
            cnt = 1;
            ele = arr[i];
        } 
        else if (arr[i] == ele) {
            cnt++;
        } 
        else {
            cnt--;
        }
    }
    System.out.println("Majority element: " + ele);
}
}
public class majorElemHash {
    public static void main(String[] args) {
        majorelm m = new majorelm();
          int ar[] = {1,2,4,2,2,2,2,1,2,1,2,7,1};
          m.majorHash(ar);
          m.majorelem(ar);
    }
}
