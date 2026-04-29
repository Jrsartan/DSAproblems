import java.util.*;
class MatrixZero{
    public void setmatrix(int[][] arr){
        int n= arr.length;
        int m=arr[0].length;
// Step 1: Mark rows and columns
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                 markRow(arr,i,m);
                 markCol(arr,j,n);
                }
            }
         }
         // Step 2: Convert -1 to 0
          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }
        // Step 3: Print matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
         public void markRow(int[][] arr, int i, int m) {
        for (int j = 0; j < m; j++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }
         public void markCol(int[][] arr, int j, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }
}
public class SetMatrixZero {
    public static void main(String args[]){
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        MatrixZero matzero = new MatrixZero();
        matzero.setmatrix(arr);
       
    }
}
