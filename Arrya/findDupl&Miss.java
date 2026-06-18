import java.util.*;
public class findDupl&Miss {
 public static void main(String args[]){
    int arr[]={6,7,5,4,2,2,1};
    int len= arr.length;
    for(int i=1;i<len;i++){
        for(int j=0;j<len;j++){
            if(arr[j]==arr[j-1]){
                System.out.println(j);
            }
            else if(arr[i]!=arr[j]){
                System.out.println(i);
            }
        }
    }
 }    
}
