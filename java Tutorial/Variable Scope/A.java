class A {

    static int b = 20; // Static Variable
    int c = 30; // Instance variable

    public static void main(String[] args) {
        int a = 10; // Local variable
        A ref = new A();
        System.out.println(a); // Print the value of local variable 'a' (10)
        System.out.println(A.b); // Print the value of static variable 'b' (20) using class name
        System.out.println(ref.c); // Print the value of instance variable 'c' (30) using object reference
    }
}
