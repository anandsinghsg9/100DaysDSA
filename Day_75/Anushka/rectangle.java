package Anushka;
import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                   System.out.print("(" + i + "," + j + ") ");
                } else {
                     System.out.print("        ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}