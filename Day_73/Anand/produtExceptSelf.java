package Day_73.Anand;

public class produtExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int point=0;
        int product=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                point++;
            }
            else{
                product*=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(point==0){
                nums[i]=product/nums[i];
            }
            else if(point==1){
                if(nums[i]==0){
                    nums[i]=product;
                }
                else{
                    nums[i]=0;
                }
            }
            else{
                nums[i]=0;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        produtExceptSelf obj=new produtExceptSelf();
        int [] nums={1,2,3,4};
        int [] ans=obj.productExceptSelf(nums);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
