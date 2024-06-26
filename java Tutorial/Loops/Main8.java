class Con7 {
     int num1; // Declare instance variables
     int num2;
    int sum;

    // Constructor with parameters
    public Con7(int a, int b) {
        num1 = a; // Assign values to instance variables
        num2 = b;
        sum = a + b;
        System.out.println(sum);
    }
}

 class Main8 {
    public static void main(String[] args) {
        Con7 c1 = new Con7(50, 150);
    }
}