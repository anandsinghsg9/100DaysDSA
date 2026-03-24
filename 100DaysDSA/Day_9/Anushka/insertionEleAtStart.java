package Day_9.Anushka;
import java.util.*;
public class insertionEleAtStart {
    public static void main(String[] args) {
        int[]arr = { 10 , 20 , 30 , 40};
        ArrayList<Integer>list = new ArrayList<>();
        for(int ele : arr){
            list.add(ele);
        }
        // insert at beginning
        list.add(0 , 500);
        System.out.print("Modified array : " + list + " ");
    }
}
