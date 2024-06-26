class A {
    void multiply() {
        int num1 = 20;
        int num2 = 200;
        int multi = num1 * num2;
        System.out.println("20 * 200 multiply is: " + multi);

    }

    void divition() {
        int num1 = 20;
        int num2 = 200;
        int div = num1 / num2;
        System.out.println("20 / 200 Divied is: " + div);

    }
}

class B extends A {

    void add() {
        int num1 = 20;
        int num2 = 200;
        int sum = num1 + num2;
        System.out.println("20 + 200 Divied is: " + sum);

    }

    void subtraction() {
        int num1 = 20;
        int num2 = 200;
        int sum = num1 + num2;
        System.out.println("20 - 200 Divied is: " + sum);

    }
}

class C {
    public static void main(String[] args) {
        B c1 = new B();
        c1.add();
    }
}