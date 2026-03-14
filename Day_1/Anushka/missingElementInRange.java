package Day_1.Anushka;
import java.util.*;
public class missingElementInRange {
    public static void main(String[] args) {
        int[]arr = { 1 , 3 , 5 , 7};
        int low = 1;
        int high = 10;
        System.out.println("Missing Numbers in the range are : "+missingRange(arr, low, high));

    }

    public static ArrayList<Integer> missingRange(int[]arr , int low , int high){
        ArrayList<Integer> result = new ArrayList<>();

        for(int i =  low ; i <= high ; i++){
            boolean found = false;

            for(int j = 0 ; j<arr.length ; j++){
                if(arr[j] == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                result.add(i);
            }
        }
        return result;

    }
}
