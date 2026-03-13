import java.util.HashSet;

class Union_Arr {
    public void union_arr(int a[],int b[]){
        HashSet<Integer> set = new HashSet<>();
         int n=a.length;
         int m=b.length;

        for(int i=0;i<n;i++){
            set.add(a[i]);
        }

        for(int i=0;i<m;i++){
            set.add(b[i]);
        }

        System.out.println("Union of arrays:");

        for(int x : set){
            System.out.print(x + " ");
        }
    }
}
public class UnionArr{
    public static void main(String[] args) {
        int arr1[]={4,5,6,6,2,1,1};
        int arr2[]={3,4,4,7,8,8,9};
        Union_Arr un = new Union_Arr();
        un.union_arr(arr1, arr2);
    
    }
}
