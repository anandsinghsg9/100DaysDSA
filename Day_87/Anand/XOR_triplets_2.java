package Day_87.Anand;

import java.util.ArrayList;
import java.util.HashSet;

public class XOR_triplets_2 {
    public int uniqueXorTriplets(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> pair=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int ans1=(nums[i]^nums[j]);
                pair.add(ans1);
            }
        }
        ArrayList <Integer>pairs=new ArrayList<>(pair);
        for(int i=0;i<pairs.size();i++){
            for(int j=0;j<nums.length;j++){
                int ans2=nums[j]^pairs.get(i);
                set.add(ans2);
            }
        }
        return set.size();
    }
    public static void main(String[] args) {
        XOR_triplets_2 obj=new XOR_triplets_2();
        int[] nums={1,2,3};
        System.out.println(obj.uniqueXorTriplets(nums));
    }
}
