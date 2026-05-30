public class printingIncreasingDecreasing {

    public static void main(String[] args) {

        int n = 5;

        printingNumbers(n);
    }

    private static void printingNumbers(int n){

        if(n == 0){
            return;
        }

        System.out.print(n + " ");

        printingNumbers(n - 1);

        System.out.print(n + " ");
    }
}