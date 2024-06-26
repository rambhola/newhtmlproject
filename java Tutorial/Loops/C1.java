
/* Multi Level Inheritace*/

class A {
    int a, b, c;

    void add() {
        a = 120;
        b = 320;
        c = a + b;
        System.out.println("Sum of  two Number" + c);
    }

    void sub() {
        a = 120;
        b = 320;
        c = a - b;
        System.out.println("Sub of  two Number" + c);
    }
}

class B extends A {

    void multi() {
        a = 120;
        b = 320;
        c = a - b;
        System.out.println("Multiplication of  two Number" + c);
    }

    void div() {
        a = 120;
        b = 320;
        c = a - b;
        System.out.println("div of  two Number" + c);
    }

}

class C extends B {
    void rem() {
        a = 120;
        b = 320;
        c = a % b;
        System.out.println("Remendewr of  two Number" + c);
    }
}

class Test {
    public static void main(String[] args) {
        C ref = new C();
        ref.add();
        ref.sub();
        ref.multi();
        ref.div();
        ref.rem();
    }
}