import java.util.HashMap;
import java.util.Map;
public class itration {
 public static void main(String[] args){
    HashMap<String,Integer> map = new HashMap<>();
    map.put("Vaibhav", 12);
    map.put("Varun", 15);
    map.put("Abhay", 11);
    map.put("Pawan", 13);
    map.put("Nikhil", 19);
    //Trasing Map using iteration
   for(Map.Entry<String,Integer> e : map.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
   }
//    Set<String> Keys = map.keySet();
//     for(String key : keys){
//         System.out.println(key+ " " + map.get(key));
//     }
 }  
} 
