package Day_78.Anushka;

public class bs {
    public static void bubbleSort(int[]nums){
        int n = nums.length;
        for(int i = 0 ; i < n - 1 ; i++){
            for(int j = 0 ; j < n - 1 - i ; j++){
                if(nums[j] > nums[j + 1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

        public static void main(String[]args){
            int[]nums = {32 , 88 , 100 , 1 , 2 , 900 , 22 , 57 , 69};
            bubbleSort(nums);
            for(int num : nums){
                System.out.println(num + " ");
        }
    }
}
