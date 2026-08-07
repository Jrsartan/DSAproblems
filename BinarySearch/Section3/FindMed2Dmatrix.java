import java.util.*;

class TwoDMatrixMid {
    public void Bruutfost2D_mat(int mat[][]){
        int n=mat.length;
        int m=mat[0].length;
        int k=0;
        int arr[]= new int[n*m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[k]=mat[i][j];
                k++;
            }
        }
         Arrays.sort(arr);
        for(int i=0;i<n*m;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(arr[n*m/2]+" ");
    }
}
public class FindMed2Dmatrix {
    public static void main(String[] args){
    int mat[][]={{10, 20, 15,25}, {21,23,30,35},{12,40,22,20},{11,1,13,14}};
    TwoDMatrixMid mid = new TwoDMatrixMid();
    mid.Bruutfost2D_mat(mat); 
    }
}
