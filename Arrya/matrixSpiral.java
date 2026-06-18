import java.util.*;
class Matrix_spiral{
    public void Matrix_spiral(int[][] mat){
        int row = mat.length;
        int coll = mat[0].length;

        int left=0;
        int right=coll-1;
        int top=0;
        int bottom=row-1;

        List<Integer> list = new ArrayList<>();
        while(top<=bottom && left<=right){
        for(int i=left;i<=right;i++){
            list.add(mat[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++){
            list.add(mat[i][right]);
        }
        right--;
         if(top<=bottom){
        for(int i=right;i>=left;i--){
            list.add(mat[bottom][i]);
        }
        bottom--;
       }
       if(left<=right){
        for(int i=bottom;i>=top;i--){
            list.add(mat[i][left]);
        }
        left++;
    } 
  }
  System.out.println(list);
}
}
public class matrixSpiral {
    public static void main(String[] args){
        int[][] matri= {{1, 2, 3}, {4 ,5 ,6}, {7, 8, 9}};
        Matrix_spiral matrix = new Matrix_spiral();
        matrix.Matrix_spiral(matri);
    }
}
