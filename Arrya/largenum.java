import java.util.*;
public class largenum {
    public static void main(String[] args) {
        int arr[]={10,52,62,53,24,65};
        int larg=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>larg){
                larg=arr[i];
            }
        }
        System.out.println(larg);
    }
}
