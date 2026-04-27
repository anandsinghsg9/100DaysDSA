package Day_27.Anand;

import java.util.HashSet;

public class candyType {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length/2;
        int type=1;
        HashSet <Integer> set=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        type=Math.min(n,set.size());
        return type;
    }
    public static void main(String[] args) {
        int[] candyType={1,1,2,2,3,3};
        candyType sol=new candyType();
        System.out.println(sol.distributeCandies(candyType));
    }
    
}
