package Day_9.Anushka;
import java.util.*;
public class insertionAtGivenPositionUsingBuiltInMethods {
    public static void main(String[] args) {
        int[]arr = { 10 , 20 , 30 , 40};
        ArrayList<Integer>list = new ArrayList<>();
        int ele = 50;
        int pos = 2;

        System.out.print("Array before insertion : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
            list.add(arr[i]);
        }
        list.add(pos - 1 , ele);

            System.out.print("Array after insertion : ");
            for(int i = 0 ; i < list.size() ; i++){
                System.out.print(list.get(i)+ " ");
            }
        }
    }

