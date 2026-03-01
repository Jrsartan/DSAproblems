import java.util.Scanner;
import java.util.Set;
public class multidim1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number of the rows:");
        int row=sc.nextInt();
        System.out.println("Enter a number of Collums:");
        int coll=sc.nextInt();

        int[][] mularr= new int[row][coll];

         System.out.println("Enter elecment in arrya:");

         for(int i=0;i<row;i++){
            for(int j=0;j<coll;j++){
                     mularr[i][j]=sc.nextInt();
            }
         }
         System.out.println("Element in arrya are:");

         for(int i=0;i<row;i++){
            for(int j=0;j<coll;j++){
                   System.out.print(mularr[i][j]+" ");
            }
            System.out.println();
         }
         System.out.println(mularr[0][0]);
         sc.close();
    }
}
