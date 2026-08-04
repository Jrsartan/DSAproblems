import java.util.*;
class ArrainSort{
    public void FindKthEle(int arr1[],int arr2[],int p){
        int n1=arr1.length;
        int n2=arr2.length;
        int n=n1+n2;
        int arr3[]=new int[n];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                arr3[k++]=arr1[i++];
            }
            else{
                arr3[k++]=arr2[j++];
            }
        }   
            while(i<n1){
                arr3[k++]=arr1[i++];
            }
            while(j<n2){
                arr3[k++]=arr2[j++];
            }
       for(int m=0;m<n;m++){
        System.out.print(arr3[m]+" ");
       }
       System.out.println();
       System.out.println(" "+arr3[p-1]);
    }
}
public class kthelemsortedarr {
    public static void main(String[] args){
    int array1[]={2, 3, 6, 7, 9};
    int array2[]={1, 4, 8, 10};
    int ele= 5;
    ArrainSort kth = new ArrainSort();
    kth.FindKthEle(array1, array2, ele);
    }
}
