
/* Multi Level Inheritace*/

class A {
    int a, b, c;

    void add() {
        a = 120;
        b = 320;
        c = a + b;
        System.out.println("Sum of  two Number");
    }

    void sub() {
        a = 120;
        b = 320;
        c = a - b;
        System.out.println("Sub of  two Number");
    }
}

class B extends A {

    void multi() {
        a = 120;
        b = 320;
        c = a - b;
        System.out.println("Multiplication of  two Number");
    }

    void div() {
        a = 120;
        b = 320;
        c = a - b;
        System.out.println("div of  two Number");
    }

}

class C1 extends B {
    void rem() {
        a = 120;
        b = 320;
        c = a % b;
        System.out.println("Remendewr of  two Number");
    }
}