
public class print5to1 {
    public static void main(String[] args) {
    
    decreasingNumbers(1);
}

    public static void decreasingNumbers(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        decreasingNumbers(n - 1);
        }
    }


