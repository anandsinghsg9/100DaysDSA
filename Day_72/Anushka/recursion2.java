public class recursion2 {
    public static void main(String[] args) {
        //print a function that print 1 - 5
        print1(1);
        print2(1);

    }
    static void print1(int n){
       System.out.println(n);
       print2(n + 1);
    }
    static void print2(int n){
        System.out.println(n);
        print3(n + 2);
    }
    static void print3(int n){
        System.out.println(n);
    }

    
}
