public class sumOfSubArraysBruteForce {
     public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int n = arr.length ;
        int maxSum = 0;
        for(int start = 0 ; start < n ; start++){
            int currentSum = 0;
            for(int end = start ; end < n ; end++){
                currentSum += arr[end];
                maxSum = Math.max(currentSum , maxSum);
            }
        System.out.print(currentSum + " ");
        System.out.println();
        System.out.println(The max sum is : + (maxSum)+"  ");
        }
    }
}
