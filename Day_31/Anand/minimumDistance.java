package Day_31.Anand;

public class minimumDistance {
    public int getMinDistance(int[] nums, int target, int start) {
        int out=Integer.MAX_VALUE;
        int i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                out=Math.min(Math.abs(i-start),out);
            }
        }
        return out;
    }
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        int target = 5;
        int start = 3;
        minimumDistance sol=new minimumDistance();
        System.out.println(sol.getMinDistance(nums, target, start));
    }
}
