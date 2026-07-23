import java.util.*;
class Findnthroot{
    public int power(int base, int exp) {
        int ans = 1;

        for (int i = 0; i < exp; i++) {
            ans =ans*base;
        }

        return ans;
    }
    public int nthRootMthele(int n,int m){
        int low=1;
        int high=m;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(power(mid,n)==m){
                return mid;
            }
            else if(power(mid,n)<m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
public class NthRootMthNo {
    public static void main(String[] args){
        int n=3;
        int m=27;
      Findnthroot root = new Findnthroot();
      int ans= root.nthRootMthele(n,m);
      System.out.print(ans);
    }
    
}
