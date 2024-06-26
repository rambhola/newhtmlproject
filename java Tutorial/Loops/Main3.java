
// Throw keywords > Generate Expention  
//Throws Key-> 
import java.util.Scanner;

public class Main3 {
    static void voterEligibility(int age) throws ArithmeticException {
        if (age < 18) {
            // throw new ArithmeticException("Not Eligible"); // it is a ArithmeticException
            // class which we have pass
            // custom messge
            int c = 5 / 0;
        } else
            System.out.println("Your Eligible For Vote ");
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the age ");
        int age = S.nextInt();
        try {
            voterEligibility(age);
        } catch (Exception k) {
            System.out.println(k);
        }

        System.out.println("Exit");
    }
}