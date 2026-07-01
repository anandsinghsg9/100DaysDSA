package Day_81.Anand;

public class maxArea {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int result=Integer.MIN_VALUE;
        while(left<right){
            int step=Math.min(height[left],height[right])*(right-left);
            result=Math.max(result,step);
            if(height[left]<height[right]){
                left++;
            }
            else if(height[right]<height[left]){
                right--;
            }
            else{
                if(height[right-1]<height[left+1]){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        maxArea obj=new maxArea();
        int []height={1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(height));
    }
}
