import java.util.*;
class MedianArr{
    public void FindMedian(int arr1[],int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        int arr3[]=new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        while(i<n1){
            arr3[k++]=arr1[i++];
        }
        while(j<n2){
            arr3[k++]=arr2[j++];
        }
    }
     int n=n1+n2;
    for(int m=0;m<n;m++){
        System.out.print(arr3[m]+" ");
    }
    System.out.println();
    if(n%2==1){
        System.out.print("The Midean of the array is:"+arr3[n/2]);
    }
    else{
        int mid=(arr3[n/2]+(arr3[n/2]-1))/2;
        System.out.println("The Midean of the array is:"+mid);
    }
  } 
}
public class medianInSort {
    public static void main(String[] args){
      int array1[]={1,3,4,6,7,9,10};
      int array2[]={2,5,8,11,12};
      MedianArr median = new MedianArr();
      median.FindMedian(array1, array2);
    }
}
