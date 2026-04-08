package Day_25.Anushka;
public class maximumSumOfSubarrayOfSizeK {
    public static int maxSum(int[]arr , int k){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i <= n - k; i++){
        int sum = 0;
        for(int j = i ; j <= i + k - 1 ; j++){
            sum += arr[j];
        }
        max = Math.max(max , sum);
   
    }
    return max;
}
    public static void main(String[] args) {
        int[]arr =  {2 , 5 , 99 , 100 , 43455 , 10};
        int k = 3;
        System.out.println("Maximum sum is : "+ maxSum(arr, k));
    }

    }
    //max = 0 
    //k = 3
    //for(int i = 0 ; i <= n - k ; i++){
    //sum = 0
    //for(int j = i ; j <= i + k - 1 ; j++)
    //sum = sum + arr[j];
    //max = MAX(max , sum) ; return max
    

