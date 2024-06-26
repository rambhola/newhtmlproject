import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        int i;
        System.out.println("Enter the Number Beatween 1 to 10: ");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();

        if (i % 2 == 0) {
            System.out.println(" Even number: ");
        } else {
            System.out.println("odd number: ");

        }
    }

}
