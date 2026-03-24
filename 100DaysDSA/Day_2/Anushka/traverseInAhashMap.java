package Day_2.Anushka;
import java.util.*;
public class traverseInAhashMap {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Anushka" , 20);
        map.put("Anand" , 24);
        map.put("Rohan" , 34);

        for (String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }
    
}
