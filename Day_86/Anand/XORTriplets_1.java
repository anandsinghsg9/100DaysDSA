package Day_86.Anand;

public class XORTriplets_1 {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<3){
            return n;
        }
        int k=(int)(Math.log(n)/Math.log(2))+1;
        int result=(int)Math.pow(2,k);
        return result;
    }
    public static void main(String[] args) {
        XORTriplets_1 obj=new XORTriplets_1();
        int[] nums={1,2,3};
        System.out.println(obj.uniqueXorTriplets(nums));
    }
}
