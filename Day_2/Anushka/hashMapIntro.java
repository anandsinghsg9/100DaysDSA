package Day_2.Anushka;
import java.util.*;

//HashMap
//Creating a HashMap
// Syntax:
// HashMap<KeyType , ValueType> map = new HashMap<>();
// Example:
// HashMap<String , Integer> map = new HashMap<>();
// Meaning:
// Key   → String
// Value → Integer
public class hashMapIntro {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Anushka" , 20);
        map.put("Rahul" , 25);
        map.put("Priya" , 22);
        map.put("Biplab" , 10);
        map.put("Ajay Kumar" , 52);
        map.put("Shaurya" , 19);

        System.out.println(map.get("Priya"));

        System.out.println(map);
        System.out.println("Map size is : " + map.size());

        System.out.println(map.containsKey("Anushka"));
        System.out.println(map.remove("Rahul"));
        System.out.println(map.remove("Anushka")); // with SOUT , it will get and and remove

        System.out.println(map);
        System.out.println("Map size is : " + map.size());

        //replacing the previous thing entirely and adding this thing
        map.put("Deepika" , 22);
        System.out.println(map);
        System.out.println("Map size is : " + map.size());

        System.out.println(map.containsKey("Anushka"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        //insert , remove , search(contains) map will search for key , get.


        // insert elements = put()
        //returns value of a key = get()
        //checks if key exists = containsKey()
        //remove element = remove()
        //size of hashMap = size()
        //if HashMap is Empty = isEmpty()
        //print Key Sets = keySet();
        //Print Values = values()

        //Keys must be unique , Values can be duplicate , Order is not guaranteed , One null key allowed
    }
}
