class DivisionTwoNumber {
    public static void main(String[] args) {
        try {
            int num1 = 100, num2 = 15, div;
            div = num1 / num2;

            System.out.println("Divided is successfully\n" + div);

        } catch (ArithmeticException e)

        {
            System.out.println(" by zero at DivisionTwoNumber");

        } finally {
            System.out.println(" Dividing is successfully Without Exception");
        }

    }
}