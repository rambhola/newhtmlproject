class StaticTest {
    // non-static method
    int multiply(int a, int b) {
        return a * b;
    }

    // static method
    static int add(int a, int b) {
        return a + b;
    }
}

public class show1 {
    public static void main(String[] args) {
        StaticTest st = new StaticTest();
        System.out.println("  7 * 5  = " + st.multiply(7, 5));
        // call the static method
        System.out.println(" 10 + 3 = " + StaticTest.add(10, 3));
    }
}