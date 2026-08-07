import java.util.*;
class Sorte2D{
    public void FindELe2DMat(int matric[][],int no){
        int row=matric.length;
        int coll=matric[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<coll;j++){
                if(matric[i][j]==no){
                    System.out.println("The no. is Found at in matrix at: "+i+" "+j);
                    break;
                }
            }
        }
    }
    // public void UsingBinarySearch(int matrix[][],int target){
    //     int row=matrix.length;
    //     int coll=matrix.length;

    //     int low=0;
    //     int high=(row*coll-1);
    //     while(low<=high){
    //         int mid= low+(high-low)/2;
    //         int row=mid/coll;
    //         int coll= mid/coll;
    //         if(matix[row][coll])==tARGET{
    //             System.out.print(target);
    //         }
    //         else if(matptnt[row][]=[]]){

    //         }
    //     }
    // }
   public boolean Matrix2Darr(int arr[][], int target) {
    int n = arr.length;
    int m = arr[0].length;

    int row = 0;
    int col = m - 1;

    while (row < n && col >= 0) {
        if (arr[row][col] == target) {
            return true;
        } else if (arr[row][col] < target) {
            row++;
        } else {
            col--;
        }
    }

    return false;
}
}
public class findElem2DMatrix {
    public static void main(String[] args) {
       int mat[][]= { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
       int target =8;
       Sorte2D matrix = new Sorte2D();
       matrix.FindELe2DMat(mat, target); 
       matrix.Matrix2Darr(mat,target);
    }
}
