package Day_89.Anand;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findMissingNumbers {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0];
        int max=nums[1];
        if(min>max){
            int temp=min;
            min=max;
            max=temp;
        }
        ArrayList<Integer> output=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        set.add(min);
        set.add(max);
        int point=2;
        while(point<nums.length){
            if(nums[point]<min){
                min=nums[point];
            }
            else if(nums[point]>max){
                max=nums[point];
            }
            set.add(nums[point]);
            point++;
        }
        for(int i=min+1;i<max;i++){
            if(!set.contains(i)){
                output.add(i);
            }
        }
        return output;
    }
    public static void main(String[] args) {
        findMissingNumbers obj=new findMissingNumbers();
        int[] nums={1,2,4,6,7,9};
        System.out.println(obj.findMissingElements(nums));
    }
}
