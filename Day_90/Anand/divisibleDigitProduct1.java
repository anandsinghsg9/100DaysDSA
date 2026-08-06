package Day_90.Anand;

public class divisibleDigitProduct1 {
    public int smallestNumber(int n, int t) {
        int remainder=Integer.MAX_VALUE;
        int output=n;
        while(remainder!=0){
            int curr=n;
            int product=1;
            while(curr!=0){
                product*=(curr%10);
                curr/=10;
            }
            remainder=product%t;
            n++;
        }
        return n-1;
    }
    public static void main(String[] args) {
        divisibleDigitProduct1 obj=new divisibleDigitProduct1();
        int n=10;
        int t=5;
        System.out.println(obj.smallestNumber(n,t));
    }
}
