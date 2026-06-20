package Day_77.Anand;

public class triplets {
    public boolean increasingTriplet(int[] nums) {
        int small1=Integer.MAX_VALUE;
        int small2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(small1>=nums[i]){
                small1=nums[i];
            }
            else if(small2>=nums[i]){
                small2=nums[i];
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        triplets obj=new triplets();
        int []nums={1,2,3,4,5};
        System.out.println(obj.increasingTriplet(nums));
    }
}
