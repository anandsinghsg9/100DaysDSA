package Anushka;

public class callStack {
    public static void main(String[] args) {
        int n = 3;
        func(n);
    }
    private static void func(int n){
        if(n == 0) return;
        System.out.println("Pre" + " " + n);
        func(n - 1);
        System.out.println("In" +" " +  n);
        func(n - 1);
        System.out.println("Post" + " " + n);
    }
}
