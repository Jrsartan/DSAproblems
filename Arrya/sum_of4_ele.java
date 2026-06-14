import java.util.*;
class sum_ele{
    public void sum_is_target(int[] arr,int target){
        int len=arr.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                for(int k=0;k<len;k++){
                    for(int m=0;m<len;m++){
                        if(arr[i]+arr[j]+arr[k]+arr[m]==0){
                            System.out.println("Sum of elementt are index:"+arr[i],arr[j],arr[k],arr[m]);
                        }
                        else{
                            System.out.prinlnt("There is not such index :");
                        }
                    }
                }
            }
        }
    }
}

 public class sum_of4_ele{
    public static void main(String[] args) {
        int[] arr ={1,0,1,0,2,-2};
        sum_ele ele = sum_ele();
       ele.sum_is_target(arr.0);
    }
}