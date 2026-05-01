package Day_41.Anushka;

public class maxCountOfPositiveAndNegativeNos {
    static int[]nums = {-3 , -2 , -1 , 0 , 1 , 2, 3 , 4, 5};
    public static void main(String[] args) {
    int negative = 0;
    int positive = 0;
    for(int i = 0 ; i < nums.length ; i++){
        if(nums[i] < 0){
            negative++;
        }else if(nums[i] > 0){
            positive++;
        }
    }
    System.out.println(Math.max(negative , positive));
    
    }
}
