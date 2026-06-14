import java.util.*;
class Left_rotat{
    public void Rotetby1(int[] arrr){
        int len=arrr.length;
            int temp=arrr[0];
        for(int i=0;i<len-1;i++){
            arrr[i]=arrr[i+1];
        }
        arrr[len-1]=temp;
        for(int i=0;i<len;i++){
            System.out.print(" "+arrr[i]);
        }
    }
}
public class rotatleft1 {
    public static void main(String[] args){
        int arr[]={1,2,4,6,7,8,9,3};
Left_rotat rot = new Left_rotat();
rot.Rotetby1(arr);
    }
}
