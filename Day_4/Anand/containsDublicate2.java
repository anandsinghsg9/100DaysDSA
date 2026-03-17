package Anand;

import java.util.HashMap;

public class containsDublicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])&& Math.abs(map.get(nums[i])-i)<=k){
                return true;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        int k=3;
        containsDublicate2 solution=new containsDublicate2();
        System.out.println("The statement that there exist a dublicate and index difference between them is less than or equal to k is "+solution.containsNearbyDuplicate(nums,k));
    }
}

