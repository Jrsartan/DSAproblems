import java.util.*;
class squrtOfNo{
    public void FindSqurtOfno(int n){
        int ans=1;
        for(int i=01;i<=n;i++){
            if(i*i<=n){
                ans=i;
            }
            else{
                break;
            }
        }
        System.out.print("The squrt of no is:"+ans);
    }
}
public class findSqurtOFNo {
     public static void main(String[] args){
        int n=25;
        squrtOfNo no = new squrtOfNo();
        no.FindSqurtOfno(n);
     }
}
