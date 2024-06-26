
/*Factorial Program */
import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        int n;
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a number you want to calculate factorial: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            fact = fact * i;

        }
        System.out.println("factorial: " + fact);

    }
}
