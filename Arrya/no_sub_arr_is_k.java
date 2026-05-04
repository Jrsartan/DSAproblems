import java.util.*;

class Sum_of_arr {
    public void no_of_sum(int arr[], int s) {
        int n = arr.length;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {   
                    sum = sum + arr[k];
                }
                sum+=arr[j];
                if (sum == s) {
                    cnt++;
                }
            }
        }
        System.out.println("Number of subarrays whose sum is k = " + cnt);
    }
}

public class no_sub_arr_is_k {   
    public static void main(String args[]) {
        int a[] = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;

        Sum_of_arr su = new Sum_of_arr();
        su.no_of_sum(a, k);
    }
}