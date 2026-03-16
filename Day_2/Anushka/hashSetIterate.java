package Day_2.Anushka;
import java.util.*;
public class hashSetIterate {
    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();
        set.add(20);
        set.add(40);
        set.add(60);
        set.add(80);
        for(int ele : set){
            ele += 2;
            System.out.print(ele+" ");
        }
        set.clear();
        
        System.out.println();
        for(int ele : set){
            ele += 4;
            System.out.print(ele+" ");
        }
    }
}