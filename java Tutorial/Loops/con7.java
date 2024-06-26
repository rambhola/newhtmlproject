class Con7 {
    private int num1; // Declare instance variables
    private int num2;
    private int sum;

    // Constructor with parameters
    public Con7(int a, int b) {
        num1 = a; // Assign values to instance variables
        num2 = b;
        sum = a + b;
        System.out.println(sum);
    }
}

public class Main7 {
    public static void main(String[] args) {
        Con7 c1 = new Con7(50, 150);
    }
}