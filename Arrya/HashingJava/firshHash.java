import java.util.HashSet;
public class firshHash {
    public static void main(String[] args) {
     HashSet<Integer> myHashset = new HashSet<>(5, 0.5f);
 myHashset.add(12);
        myHashset.add(23);
        myHashset.add(54);
        myHashset.add(55);
        myHashset.add(12);
        myHashset.add(54);
       System.out.println(myHashset.contains(2));
       System.out.println(myHashset.clone());
       System.out.println(myHashset.isEmpty());
       System.out.println(myHashset.remove(54));
        System.out.println(myHashset);
        System.out.println(myHashset.size());
}
}