import java.util.*;

class sub_arr {
    public void sumofsubarr_k(int arr[], int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sumpre = 0, cnt = 0;
        int len = arr.length;

        for(int i = 0; i < len; i++) {

            sumpre += arr[i];

            int remov = sumpre - k;

            if(map.containsKey(remov)) {
                cnt += map.get(remov);
            }

            map.put(sumpre, map.getOrDefault(sumpre, 0) + 1);
        }

        System.out.println(cnt);
    }
}

public class no_sub_arr_is_K_optimal {
    public static void main(String args[]) {

        int a[] = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;

        sub_arr sub = new sub_arr();
        sub.sumofsubarr_k(a, k);
    }
}