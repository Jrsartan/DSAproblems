import java.util.*;
class Leader{
    public ArrayList<Integer> leaderArr(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int len=arr.length;
    for(int i=0;i<len;i++){
        boolean leader = true;
    for(int j=i+1;j<len;j++){
        if(arr[j]>arr[i]){
            leader=false;
            break;
        }
    }
     if(leader==true){
        ans.add(arr[i]);
    }
    }
        return ans;
    }
}
public class BrutalSol {
    public static void main(String[] args){
     int array[]={16, 17, 4, 3, 5, 2};
        Leader lead = new Leader();
       ArrayList<Integer> result = lead.leaderArr(array);
       System.out.println(result);
    }
}
