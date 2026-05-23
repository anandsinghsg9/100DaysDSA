package Anand;

import java.util.Arrays;

public class sortedAndRotated {
    public boolean check(int[] nums) {
        int sorted[]=new int[nums.length];
        int rotate=0;
        int exact=0;
        sorted[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sorted[i]=nums[i];
            if(nums[i]==nums[i-1]){
                exact=1;
            }
            else{
                exact=0;
            }
            if(nums[rotate]>nums[i]  || (nums[rotate]==nums[i] && exact!=1)){
                rotate=i;
            }
        }
        Arrays.sort(sorted);
        for(int i=0;i<sorted.length;i++){
            if(sorted[i]!=nums[(rotate+i)%nums.length]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        sortedAndRotated solution=new sortedAndRotated();
        int nums[]={3,4,5,1,2};
        System.out.println(solution.check(nums));   
    } 
}
