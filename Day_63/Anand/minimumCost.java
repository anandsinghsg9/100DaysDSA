package Anand;

import java.util.Arrays;

public class minimumCost {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int output=0;
        int count=0;
        int point=(cost.length-1);
        while(point>-1){
            if(count<2){
                output=output+cost[point];
                count++;
                point--;
            }
            else{
                point--;
                count=0;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        minimumCost obj=new minimumCost();
        int[] cost={1,2,3};
        System.out.println(obj.minimumCost(cost));
    }
}
