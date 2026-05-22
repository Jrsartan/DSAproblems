import java.lang.*;
import java.util.*;
//Brootfost solution
class arr_map {

    public void hash_Map(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {

            if (map.containsKey(i)) {

                map.put(i, map.get(i) + 1);

            } else {

                map.put(i, 1);
            }
        }

        System.out.println(map);
    }
    //optimal solution
  public void messur_uss_map(int arr[]){
            ArrayList<Integer> list = new ArrayList<>();
      HashMap<Integer, Integer> map = new HashMap<>();
            int len =arr.length;
         int mini = len/3;
        for(int i=0;i<len;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])>mini){
                list.add(arr[i]);
            }
            if(list.size()==2){
                break;
            }
        }
        System.out.println(list);
    }
}
public class Arr_hashmap {

    public static void main(String args[]) {

        int ar[] = {1,1,1,3,4,4,4,2};

        arr_map obj = new arr_map();

        obj.hash_Map(ar);
        obj.messur_uss_map(ar);
    }
}