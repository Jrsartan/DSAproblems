import java.util.*;
class AllotBook{
    public int Pagsof_Book(int arr[],int pages){
        int len=arr.length;
        int std=1;
        int pageStud=0;
        for(int i=0;i<len;i++){
            if(pageStud+arr[i]<=pages){
                pageStud+=arr[i];
            }
            else{
                std++;
                pageStud=arr[i];
            }
        }
        return std;
    }
    public int PageAlloting(int arr[],int m){
          if (m > arr.length)
            return -1;
        int high=Arrays.stream(arr).sum();
        int low=Arrays.stream(arr).max().getAsInt();
        for(int i=low;i<high;i++){
            int cntstd=Pagsof_Book(arr,i);
            if(cntstd<=m){
                return i;
            }
        }
        return -1;
    }
    public int optimalSol(int arr[],int m){
        int high=Arrays.stream(arr).sum();
        int low=Arrays.stream(arr).max().getAsInt();
        while(low<=high){
            int mid=low+(high-low)/2;
            int cntStd=Pagsof_Book(arr,mid);
            if(cntStd>m){
                low=mid+1;
            }
            else{
            high=mid-1;
        }
    }
        return low;
    }
}
public class bookAllotment {
    public static void main(String[] args){
        int array[]={25,46,28,49,24};
        int m=4;
      AllotBook book = new AllotBook();
      int result=book.PageAlloting(array,m);
      int biresult=book.optimalSol(array,m);
      System.out.println(result);
      System.out.println("Ans of The optimal solution is: "+biresult);
    }
}
