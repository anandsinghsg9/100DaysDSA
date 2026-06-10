package Anand;

import java.util.ArrayList;
import java.util.List;

public class extraCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int point=1;
            for(int j=0;j<candies.length;j++){
                if(i!=j && candies[i]+extraCandies<candies[j]){
                    point=0;
                }
            }
            if(point==1){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        extraCandies obj = new extraCandies();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(obj.kidsWithCandies(candies, extraCandies));
    }
}
