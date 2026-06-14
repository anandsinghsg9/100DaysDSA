import java.util.*;

public class arrayOfStrings {
    public static void main(String[] args) {
        String[] arr = {"Shree", "Yuvraj", "Mahi", "Nikunj"};

        ArrayList<String> list = new ArrayList<>();
        list.add("Niharika");

        for(String ele : arr){
            System.out.println(ele);
        }

        System.out.println(list);
    }
}
