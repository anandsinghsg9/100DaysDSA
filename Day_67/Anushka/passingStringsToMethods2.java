public class passingStringsToMethods2 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Anushka");
        System.out.println("Before : "  + s);

        change(s);
        System.out.println("After : " + s);
    }
    static void change(StringBuilder s){
        s.reverse();
        System.out.println("Reversed : " + s);
    }
}
