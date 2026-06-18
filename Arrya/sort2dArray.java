import java.util.*;

public class sort2dArray {

    public static List<List<Integer>> mergeIntervals(int[][] arr) {

        int n = arr.length;

        // Sort according to start time
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int start = arr[i][0];
            int end = arr[i][1];

            // Skip if interval already merged
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {

                if (arr[j][0] <= end) {

                    end = Math.max(end, arr[j][1]);

                } else {
                    break;
                }
            }

            ans.add(Arrays.asList(start, end));
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };

        System.out.println(mergeIntervals(arr));
    }
}