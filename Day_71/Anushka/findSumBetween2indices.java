
public class findSumBetween2indices {
    public static void main(String[] args) {
    int[]arr = {1, 2, 3, 4, 5};
    int left = 1;
    int right = 3;
    int prefix[] = new int[arr.length];
    prefix[0] = arr[0];
    for(int i = 1 ; i < arr.length ; i++){
        prefix[i] = prefix[i - 1] + arr[i];
    }
    int result = 0;
    if(left == 0){
        result = prefix[right];
        System.out.println(result);
    }
    else {
       result =  prefix[right] - prefix[left - 1];
       System.out.println(result);
    }
    }
}
