import java.util.Arrays;
public class binaryserch {
    public static void main(String[] args) {
        int intArr[]={20,52,62,85,65,45};
        int intArr1[]={20,55,85,45};
      //  System.out.println("Sorte Arrya is:"+Arrays.sort(intArr));
        int intKye=65;
        System.out.println(intKye+" Found at Index "+Arrays.binarySearch(intArr,intKye));
        System.out.println("Compair tow arrys: "+Arrays.compare(intArr,intArr1));
    }
}
