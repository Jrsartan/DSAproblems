import java.util.*;
class TowDMatrix{
    public int FindMaxIndexColl(int arr[][],int n,int m,int coll){
        int maxValu=-1;
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i][coll]>maxValu){
                maxValu=arr[i][coll];
                index=i;
            }
        }
        return index;
    }
    public void FidnPeakElement(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int maxRowElem=FindMaxIndexColl(matrix, n, m, mid);
            int left=mid-1>=0 ? matrix[maxRowElem][mid-1] : -1;
            int right=mid+1<=m ? matrix[maxRowElem][mid+1] : -1;

            if(matrix[maxRowElem][mid]>left && matrix[maxRowElem][mid]>right){
                System.out.print(maxRowElem+"&"+mid);
                break;
            }
            else if(matrix[maxRowElem][mid]<left){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        // System.out.print(-1+"&"+-1);
    }
}
public class FindPeakELe2Dmat {
    public static void main(String[] args){
        int mat[][]={{10, 20, 15,25}, {21,23,30,35},{12,40,22,20},{11,1,13,14}};
        TowDMatrix peak = new TowDMatrix();
        peak.FidnPeakElement(mat);
    }
}
