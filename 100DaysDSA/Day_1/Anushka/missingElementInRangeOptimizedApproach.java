package Day_1.Anushka;
import java.util.*;
public class missingElementInRangeOptimizedApproach {
    public static void main(String[] args) {
        int[]arr = { 1 , 3, 5 , 7};
        int low = 1;
        int high = 10;
        System.out.println("Missing numbers in Range : " + missingRange(arr , low , high));
    }
    public static ArrayList<Integer>missingRange(int[]arr , int low , int high){
        HashSet<Integer>set = new HashSet<>();
        ArrayList<Integer>result = new ArrayList<>();

        for(int num : arr){
            set.add(num);
        }

        for(int i = low ; i <= high ; i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}
