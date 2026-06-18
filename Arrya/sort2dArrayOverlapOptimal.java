import java.util.*;

class overlapElem {

    public void overlapElemetn(int[][] arr) {

        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {

            if(list.isEmpty() ||
               arr[i][0] > list.get(list.size()-1).get(1)) {

                list.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            else {

                List<Integer> last =
                        list.get(list.size()-1);

                last.set(
                        1,
                        Math.max(last.get(1), arr[i][1])
                );
            }
        }

        System.out.println(list);
    }
}

public class sort2dArrayOverlapOptimal {

    public static void main(String[] args) {

        int[][] arr = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };

        overlapElem over = new overlapElem();
        over.overlapElemetn(arr);
    }
}