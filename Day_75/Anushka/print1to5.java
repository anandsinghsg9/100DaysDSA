public class print1to5 {
    public static void main(String[] args) {
        countingNumbers(1);
    }


        private static void countingNumbers(int n){
            if (n == 6) {
                return;
                }
                System.out.println(n);
                countingNumbers(n + 1);
            }
        }
