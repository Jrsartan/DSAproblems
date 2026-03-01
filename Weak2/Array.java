import java.util.*;

public class Array {
    public static void main(String[] args) {
        int[] arr;
        arr=new int[5];
       arr[0]=32;
       arr[1]=31;
       arr[2]=43;
       arr[3]=23;
       arr[4]=64;
       for(int i=0;i<5;i++){
        System.out.println("At index"+i+":"+arr[i]);
       }
    }
}
