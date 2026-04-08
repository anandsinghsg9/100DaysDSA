package Day_25.Anushka;

public class maxSumOfSubarrayOptimised {
    
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 2, 9, 1};
        int k = 3;

        System.out.println("Max Sum: " + maxSum(arr, k));
    }

    public static int maxSum(int[] arr, int k) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        while (j < n) {
            sum += arr[j];

            // window size < k
            if (j - i + 1 < k) {
                j++;
            }
            // window size == k
            else if (j - i + 1 == k) {
                max = Math.max(max, sum);

                // slide window
                sum -= arr[i];
                i++;
                j++;
            }
        }

        return max;
    }
}
//pseudocode
//max = 0 ; sum = 0; k = 3;
//for(int j = 0 ; j < k ; j++){
//sum = sum + arr[j];
//max = MAX(max , sum);
//sliding window , j goes to end
//while(j < n)
//sum = sum + arr[j];
//remove ith ele , add next ele to sum
//sum = sum - arr[i];
//i++;
//j++;
//max = max(max , sum)
//return max
