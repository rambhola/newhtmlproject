// Expention Handiling  - > 
// Types of Expention -  1. Checked Expection > Compile Time // 2. Unchecked Expemtion > Runtime  

public class exp {
    public static void main(String[] args) {

        int price[] = { 1, 2, 3, 4, 5 };
        int a = 10;
        int b = 0;

        // System.out.println(price[9]);

        try {
            System.out.println(price[1]);
            int c = a / b;
            System.out.println(c);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Index 9 out of bounds for length 5 ");

        }

        catch (ArithmeticException e) {

            System.out.println("Not Devided by Ziro");
        } finally {
            System.out.println("Excuted this program");
        }

    }

}
