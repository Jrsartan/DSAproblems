import java.util.*;
class Mover_zero{
    public void move_zero_arr(int arr[]){
        int temp[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
              temp[j]=arr[i];
               j++;
            }
        }
        while(j<arr.length){
            temp[j]=0;
            j++;
        }
         for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
         }
       System.out.println("After the moving!");
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
    public void move_to_zero(int arr[]){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
        System.out.println();
        System.out.println("After Zero move to word the lasst of array!");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
public class movezerolast {
   public static void main(String[] args) {
    Mover_zero mov = new Mover_zero();
    int a[]={4,6,0,7,5,0,0,6,0,1};
    mov.move_zero_arr(a);
    mov.move_to_zero(a);
   } 
}
