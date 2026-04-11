import java.util.Arrays;

public class longestHarmonicSequence {
    public int findLHS(int[] nums) {
        int left=0;
        int out=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            while(nums[i]-nums[left]>1){
                left++;
            }
            if((nums[i]-nums[left])==1){
                out=Math.max(out,i-left+1);
            }
        }
        return out;
    }
    public static void main(String[] args) {
        int []nums={1,3,2,2,5,2,3,7};
        longestHarmonicSequence sol=new longestHarmonicSequence();
        System.out.println(sol.findLHS(nums));
    }
    
}
