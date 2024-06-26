import java.util.Scanner;

class OddEven1 {
    public static void main(String[] args) {
        int i;
        System.out.println("Enter the Number Beatween 1 to 10: ");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        for (i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(" Even number: " + i);
            } else {
                System.out.println("odd number: " + i);

            }
        }
    }

}
