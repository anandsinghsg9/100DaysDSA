package Day_80.Anand;

public class maxSumk {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=(nums[i]);
        }
        double output=sum;
        for(int i=k;i<nums.length;i++){
            double step=(sum+nums[i]-nums[i-k]);
            output=Math.max(output,step);
            sum=step;
        }
        return (output/k);
    }
    public static void main(String[] args) {
        maxSumk obj=new maxSumk();
        int []nums={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(obj.findMaxAverage(nums,k));
    }
}
