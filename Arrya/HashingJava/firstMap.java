import java.util.HashMap;
public class firstMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        //insertion
        map.put("Indeia", 120);
        map.put(  "US",30);
        map.put("China", 150);
        System.out.println(map);
         map.put("china",180);
         System.out.println(map);

         if(map.containsKey("Indonesia")){
            System.out.println("Key is present in a map");
         }
         else{
            System.out.println("Key is not present in map");
         }
         System.out.println(map.get("china"));
         System.out.println(map.get("Amerika"));
         System.out.println(map.containsValue(180));
         System.out.println(map.keySet());
         System.out.println(map.values());

     //ireration of map in java
     int arr[]={12,43,67,45,35,32,4};
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
      for(int val : arr){
        System.out.print(val+" ");
      }
}
}
