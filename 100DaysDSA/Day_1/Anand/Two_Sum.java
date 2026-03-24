import java.util.HashMap;
import java.util.Arrays;
public class Two_Sum{
    public int[] twoSum(int[] nums, int target) {
        HashMap< Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement= target-nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Two_Sum solver= new Two_Sum();
        int my_num[]= {15,7,2,11};
        int my_targets=9;
        int result[]= solver.twoSum(my_num,my_targets);
        System.out.println("indices"+ Arrays.toString(result));
    }
}