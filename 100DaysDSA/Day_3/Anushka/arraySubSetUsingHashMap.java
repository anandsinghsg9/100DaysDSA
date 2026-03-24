package Day_3.Anushka;
import java.util.*;
public class arraySubSetUsingHashMap{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 4};
        boolean result = isSubset(a, b);
        if (result) {
            System.out.println("b is the subset of a");
        } else {
            System.out.println("b is not the subset of a");
        }
    }

    public static boolean isSubset(int[] a, int[] b) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : b) {
            if (!map.containsKey(num)) {
                return false;
            }

            map.put(num, map.get(num) - 1);

            if (map.get(num) == 0) {
                map.remove(num);
            }
        }

        return true;
    }


}