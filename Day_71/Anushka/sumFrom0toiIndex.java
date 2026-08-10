public class sumFrom0toiIndex {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9,10,11};
        int[]prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        int i = 2;
        System.out.println(prefixSum[i]);
    }
}
