import java.util.*;
public class minCostOfBuyingCandiesWithDiscount {
    public static int minCost(int[]cost){
        Arrays.sort(cost);
        int count = 0;
        int ans = 0;
        for(int i = cost.length - 1 ; i >= 0 ; i --){
            count++;
            if(count % 3 != 0){
                ans += cost[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]cost = {1 , 2  , 3 , 4};
        int result = minCost(cost);
        System.out.println("Minimum cost of buying candies w/o discount : " + result);
    }
}
