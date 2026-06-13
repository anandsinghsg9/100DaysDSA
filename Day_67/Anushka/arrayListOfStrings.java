import java.util.*;
public class arrayListOfStrings {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        for(String ele : list){
            System.out.println(ele + " ");
        }
    }
}
