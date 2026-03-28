package Day_15.Anushka;

public class sortArrayByParity {
    public static void main(String[] args) {
        int[]nums = {3 , 1 , 4, 2};
        nums = sortArrayByParity(nums);
        for(int ele : nums){
            System.out.println(ele+" ");
        }
       public static int[] sortArrayByParity(int[] nums) {
        int j = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }
} 
    

