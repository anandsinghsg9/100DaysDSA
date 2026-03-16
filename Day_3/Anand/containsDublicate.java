import java.util.HashMap;
class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            else{
                map.put(nums[i],true);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        containsDuplicate sol = new containsDuplicate();

        // Test Case 1: Contains duplicates
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Test Case [1, 2, 3, 1]: " + sol.containsDuplicate(nums1)); 
        // Expected: true
    }
}