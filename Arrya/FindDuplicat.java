import java.util.*;
class Disp_Duplicat{
    public void select_dupli(int[] arr){
        int len= arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
            if(arr[i]==arr[j]){
                System.out.println("Duplicat element is:"+arr[i]);
            }
        }
    }
       System.out.println("Ther is no any duplicate number!!");
    }
    public void optimal_sol(int[] arr){
        int len=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<len;i++){
            if(arr[i]==arr[i-1]){
                System.out.println("Find a duplicate element:"+arr[i]);
                break;
            }
        }
    }
    public void slo_using_hashmap(int[] arr){
       HashSet<Integer> set = new HashSet<>();
       for(int num: set){
        if(set.contains(num)){
            System.out.println("Duplicate elemetns is:"+num);
            return;
        }
        set.add(num);
       }
    }
}
public class FindDuplicat {
    public static void main(String[] args) {
        int[] arr={1,23,4,45,65,3,23,5};
        Disp_Duplicat ele = new Disp_Duplicat();
        ele.select_dupli(arr);
        ele.slo_using_hashmap(arr);
        ele.optimal_sol(arr);
    }
}
