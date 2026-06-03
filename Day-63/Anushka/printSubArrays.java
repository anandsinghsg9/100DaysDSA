public class printSubArrays {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int n = arr.length ;
        for(int start = 0 ; start < n ; start++){
            for(int end = start ; end < n ; end++){
                for(int k = start ; k <= end ; k++){
                    System.out.println(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
