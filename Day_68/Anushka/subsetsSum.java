import java.util.*;
public class subsetsSum {
    public ArrayList<Integer> subsetSums(int[]arr){
     ArrayList<Integer>list = new ArrayList<>();
     subset(0,0,arr,list);
     return list;
    }
    public static void subset(int ans , int i , int[]arr , ArrayList<Integer>list){
        if(i == arr.length){
         list.add(ans);
          return;
        }

        //skip
        subset(ans, i+1, arr, list);

        //add
        subset(ans + arr[i] , i+1 , arr , list);
    }
    public static void main(String[] args) {
        subsetsSum obj = new subsetsSum();
        int[]arr = {1,2,3};
        ArrayList<Integer>result = obj.subsetSums(arr);
        Collections.sort(result);
        System.out.println(result);
    }
}
