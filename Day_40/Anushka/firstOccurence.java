package Day_40.Anushka;

public class firstOccurence {
    public static int firstOccurence(int[]nums , int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
                high = mid - 1;
        }else if(nums[mid] < target){
            low = mid + 1;
        }else {
            high = mid - 1;
        }
    }
    return ans;
}
public static void main(String[] args) {
    int[]nums = { 2 , 4 , 4 , 5, 4 , 4, 4, 4};
    int target = 4;
    int result = firstOccurence(nums, target);
    System.out.println("The first occurence is : " + result);
    }
}
