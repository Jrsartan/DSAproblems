import java.util.*;
class MedianArr{
    public void FindMedian(int arr1[],int arr2[]){
         int n1 = arr1.length;
        int n2 = arr2.length;

        int[] arr3 = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge the two arrays
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            arr3[k++] = arr1[i++];
        }

        while (j < n2) {
            arr3[k++] = arr2[j++];
        }

        int n = n1 + n2;

        if (n % 2 == 1) {
           System.out.println("The ans is:"+arr3[n / 2]);
        } else {
            int mid= (arr3[n / 2] + arr3[(n / 2) - 1]) / 2;
            System.out.println("The ans is:"+mid);
        }
  } 
}
public class medianInSort {
    public static void main(String[] args){
      int array1[]={2, 4, 6};
      int array2[]={1, 3, 5};
      MedianArr median = new MedianArr();
      median.FindMedian(array1, array2);
    }
}
