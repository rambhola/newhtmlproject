import java.util.Scanner;;

public class PrimeNumber {
    public static void main(String[] args) {

        int n, counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your n number: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        if (counter == 2)
            System.out.println("Prime Number:  ");
        else
            System.out.println("Not prime Number: ");

    }

}
