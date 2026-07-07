import java.util.Arrays;

class SortTwoArrayDemo{
    public void mergeArrays(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int left=0;
        int right=0;
        int index=0;
        int arr3[]=new int[n+m];
        while(left<n && right<m){
            if(arr1[left]<=arr2[right]){
                arr3[index]=arr1[left];
                left++;
                index++;
            }
            else{
                arr3[index]=arr2[right];
                index++;
                right++;
            }
        }
        while(left<n){
            arr3[index]=arr1[left];
            index++;
            left++;
        }
        while(right<m){
            arr3[index]=arr2[right];
            index++;
            right++;
        }
        for(int i=0;i<n+m;i++){
            if(i<n){
                arr1[i]=arr3[i];
            }
            else{
                arr2[i-n]=arr3[i];
            }
        }
        System.out.print("Array1: ");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.print("Arrya2: ");
        for(int i=0;i<m;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
    public void optimalsol(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int left=n-1;
        int right=0;
        
        while(left>=0 && right<0){
            if(arr1[left]<arr2[right]){
                int temp= arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
                left--;
                right++;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.print("Array 1: ");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.print("Array 2: ");
        for(int i=0;i<m;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}

public class sortTowArray {
    public static void main(String[] args){
        int arr1[]={1,3,4,6,8,11};
        int arr2[]={2,4,5,7,9,10};
        SortTwoArrayDemo soarr = new SortTwoArrayDemo();
        soarr.mergeArrays(arr1,arr2);
        soarr.optimalsol(arr1,arr2);
    }
}
