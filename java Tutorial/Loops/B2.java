/* ConstructoOverlaoding */

class A {
    // instance Variable
    int a;
    double b;
    String c;

    // Defould Constructor
    A() {
        a = 100;
        b = 10.14;
        c = "\nConstructoOverlaoding";

    }

    // Paramiter Constructor
    A(int x) {
        a = x;
    }

    A(double y, String z) {
        b = y;
        c = z;
    }

}

// Main Method
class B2 {
    public static void main(String[] args) {
        A Rt = new A();
        A Rt2 = new A(450);
        A Rt3 = new A(14.45, "java");
        System.out.println(Rt.a + "\n" + Rt.b + "" + Rt.c);
        System.out.println(Rt2.a);
        System.out.println(Rt3.b + "\n" + Rt3.c);
    }
}
