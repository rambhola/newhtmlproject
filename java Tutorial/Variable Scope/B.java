public class B {
    static int a = 10;

    void fun() {
        int b = 10;
        System.out.println(a + " " + b); // 10 10
        ++a;
        ++b;
    }

    public static void main(String[] args) {
        B r = new B(); // Create an instance of class B
        r.fun();
        r.fun();
    }
}
