import java.util.*;

class Tow_D_Mat {

    public void find_ele_2d(int[][] mat, int target) {

        boolean found = false;

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {

                if (mat[i][j] == target) {

                    System.out.println(
                        "Element found at row "
                        + i + " column " + j
                    );

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element is not present in matrix");
        }
    }
}

public class findElein2D {

    public static void main(String[] args) {

        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        int target = 8;

        Tow_D_Mat mat = new Tow_D_Mat();

        mat.find_ele_2d(arr, target);
    }
}