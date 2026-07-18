package Day_83;

public class gcdOfArray {
    public int findGCD(int[] nums) {
        int a=Integer.MAX_VALUE;
        int b=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(b<nums[i]){
                b=nums[i];
            }
            if(a>nums[i]){
                a=nums[i];
            }
        }
        while(a>0){
            int temp=b%a;
            b=a;
            a=temp;
        }
        return b;
    }
    public static void main(String[] args) {
        gcdOfArray obj=new gcdOfArray();
        int[] nums={2,5,6,9,10};
        System.out.println(obj.findGCD(nums));
    }
}
