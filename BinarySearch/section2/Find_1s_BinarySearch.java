class Matrix {

    // Returns index of first occurrence of x (1)
    public int lowerBound(int arr[], int x) {

        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public void No_1sinMatrix(int mat[][]) {

        int rows = mat.length;
        int cols = mat[0].length;

        int maxCnt = -1;
        int index = -1;

        for (int i = 0; i < rows; i++) {

            int firstOne = lowerBound(mat[i], 1);

            int cntOnes = cols - firstOne;

            if (cntOnes > maxCnt) {
                maxCnt = cntOnes;
                index = i;
            }
        }

        System.out.println("Row with maximum 1's = " + index);
        System.out.println("Number of 1's = " + maxCnt);
    }
}

public class Find_1s_BinarySearch {

    public static void main(String[] args) {

        int mat[][] = {
                {0, 0, 1},
                {0, 1, 1},
                {0, 1, 1}
        };

        Matrix ele = new Matrix();
        ele.No_1sinMatrix(mat);
    }
}