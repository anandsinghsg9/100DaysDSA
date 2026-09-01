package Day_95;

public class longestOnes3 {
    public int longestOnes(int[] nums, int k) {
        int temp=k;
        int left=0;
        int right=k;;
        for(int i=0;i<k;i++){
            if(nums[i]==0){
                temp--;
            }
        }
        int count=right-left;
        for(int j=k;j<nums.length;j++){
            if(nums[j]==1){
                right++;
            }
            else{
                if(temp>0){
                    temp--;
                    right++;
                }
                else{
                    while(temp==0){
                        if(nums[left]==0){
                            temp++;
                        }
                        left++;
                    }
                    temp--;
                    right++;
                }
            }
            int step=right-left;
            count=Math.max(count,step);
        }
        return count;
    }
    public static void main(String[] args) {
        longestOnes3 obj=new longestOnes3();
        int []nums = {1,1,1,0,0,0,1,1,1,1,0};int k = 2;
        System.out.println(obj.longestOnes(nums, k));
    }
}
