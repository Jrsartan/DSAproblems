import java.util.*;
class find_NCR{
    public void ncr_find_opti(int n,int r){
        int res=1;
        for(int i=0;i<r;i++){ 
            res=res*(n-i);
            res=res/(i+1);
        }
        System.out.println("Output of the NcR is: "+res);
    }
    public void print_row(int n){
        int ans=1;
        System.out.print(ans+" ");
        for(int i=1;i<n;i++){
           ans=ans*(n-i);
           ans=ans/i;
           System.out.print(ans+" ");
        }
    }
    public void print_trangle(int n){
       for(int i=1;i<=n;i++){
         print_row(i);
          System.out.println();
       }
       System.out.println();
    }
}
public class findNCR {
    public static void main(String args[]){
        int col=3;
        int row=6;
        find_NCR ncr = new find_NCR();
        ncr.ncr_find_opti(row,col);
        ncr.print_row(row);
        System.out.println();
        System.out.println();
        ncr.print_trangle(row);
    }
}
