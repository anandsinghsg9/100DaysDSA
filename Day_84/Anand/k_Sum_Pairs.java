package Day_84.Anand;

import java.util.Arrays;

public class k_Sum_Pairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int result=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==k){
                result++;
                left++;
                right--;
            }
            else if(sum>k){
                right--;
            }
            else {
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        k_Sum_Pairs obj=new k_Sum_Pairs();
        int[] nums={1,2,3,4};
        int k=5;
        System.out.println(obj.maxOperations(nums,k));
    }
}
