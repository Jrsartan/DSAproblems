class Matrix{
    public void Find_1s(int matrix[][]){
      int index=-1;
      int max_cnt=-1;
      int n=matrix.length;
      for(int i=0;i<n;i++){
        int cntrow=0;
         for(int j=0;j<n;j++){
        cntrow+=matrix[i][j];
         }
         if(cntrow>=max_cnt){
            max_cnt=cntrow;
            index=i;
         }
    }
    System.out.println("Maximun 1s found at the row: "+index);
    }
}
public class Find_i_inRow {
    public static void main(String[] args){
     int mat[][] = {  {0, 0, 1}, {0, 1, 1}, {0, 1, 1} };
Matrix obj = new Matrix();
obj.Find_1s(mat);
    }
}
