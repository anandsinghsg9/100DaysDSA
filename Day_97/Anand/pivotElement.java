package Day_97.Anand;

public class pivotElement {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=0;
        right[n-1]=0;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]+nums[i-1];
        }
        for(int j=(n-2);j>-1;j--){
            right[j]=nums[j+1]+right[j+1];
        }
        for(int k=0;k<n;k++){
            if(left[k]==right[k]){
                return k;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        pivotElement obj=new pivotElement();
        int []nums = {1,7,3,6,5,6};
        System.out.println(obj.pivotIndex(nums));
    }
}
