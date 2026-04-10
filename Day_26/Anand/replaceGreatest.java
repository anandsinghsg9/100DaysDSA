package Day_26.Anand;
import java.util.Arrays;  

public class replaceGreatest {
    public int[] replaceElements(int[] arr) {
        int max=arr[arr.length-1];
        int []output= new int [arr.length];
        for(int i=arr.length-1;i>0;i--){
            max=Math.max(max,arr[i]);
            output[i-1]=max;
        }
        output[arr.length-1]=-1;
        return output;
    }
    public static void main(String[] args) {
        int [] arr={17,18,5,4,6,1};
        replaceGreatest sol=new replaceGreatest();
        System.out.println(Arrays.toString(sol.replaceElements(arr)));
    }
    
}
