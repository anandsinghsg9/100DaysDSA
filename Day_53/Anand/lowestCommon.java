package Anand;

public class lowestCommon {
    public int getCommon(int[] nums1, int[] nums2) {
        int output=-1;
        int left=0;
        int right=0;

        while(output<0 && left<nums1.length && right<nums2.length){
            if(nums1[left]==nums2[right]){
                output=nums2[right];
            }
            else if(nums1[left]<nums2[right]){
                left++;
            }
            else{
                right++;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        lowestCommon l=new lowestCommon();
        int[] nums1={1,2,3,6};
        int[] nums2={2,4,5};
        System.out.println(l.getCommon(nums1, nums2));
    }
}
