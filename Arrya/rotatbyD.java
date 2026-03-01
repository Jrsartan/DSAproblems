import java.util.*;
class Solution {
public void rotatArray(int arr[],int d){
d=d%arr.length;
        int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];
        }
        int j=0;
        for(int i=arr.length-d;i<arr.length;i++){
            arr[i]=temp[j];
            j++;
        }
       System.out.println("After rotating array!");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
   }
   public void rotatArray1(int arr[],int start,int end){
    for(int i=start;i<=end;i++){
        int temp=arr[start];
        arr[i]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
    }
    System.out.println();
   }
}
public class rotatbyD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to rotat the array: ");
        int d=sc.nextInt();
        int arr[]={10,20,30,40,50,60,70};
        Solution solv = new Solution();
        solv.rotatArray(arr, d);
        solv.rotatArray1(arr, 0,d-1);
        solv.rotatArray1(arr, d, arr.length-1);
        solv.rotatArray1(arr, 0, arr.length-1);
        
    }
}
