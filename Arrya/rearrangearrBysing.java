import java.util.*;
class arrangeArra{
    public void arrangeArr_Sign(int arr[]){
        Scanner sc=new Scanner(System.in);        int pos[]=new int[arr.length/2];
        int neg[]=new int[arr.length/2];
        int p=0;
        int n=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos[p++] = arr[i];
            }
            else{
                neg[n++] = arr[i];
            }
        }
        int res[]=new int[arr.length];
        for(int i=0;i<pos.length;i++){
             res[2*i]=pos[i];
        }
        for(int j=0;j<neg.length;j++){
            res[2*j+1]=neg[j];
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
    public void optimal_sol(int arr[]){
        int ans[]=new int[arr.length];
        int po=0,neg=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans[po]=arr[i];
                po+=2;
            }
            else{
                ans[neg]=arr[i];
                neg+=2;
            }
        }
        for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");

        }
    }
}
public class rearrangearrBysing {
    public static void main(String[] args) {
        arrangeArra a = new arrangeArra();
         int arr[]={3,1,-2,-5,2,-4};
        a.arrangeArr_Sign(arr);
        a.optimal_sol(arr);
    }
}
