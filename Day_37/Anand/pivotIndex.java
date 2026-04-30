package Anand;

public class pivotIndex {
    public static int pivotIndex(int[] nums){
        int rightsum=0;
        for(int i=0;i<nums.length;i++){
            rightsum+=nums[i];
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            rightsum-=nums[i];
            if(rightsum==leftsum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int []nums={1,7,3,6,5,6};
        pivotIndex solution=new pivotIndex();
        System.out.println(solution.pivotIndex(nums));
    }
}

