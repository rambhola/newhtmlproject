class A {

    void input() {
        System.out.println("Enter your name ");

    }

    void input1() {
        System.out.println("Enter your adhar number");
    }

}

class B extends A {
    void show() {
        System.out.println("my name is ram");
    }

    void show1() {
        System.out.println("12874514523");
    }
}

class C extends A {
    void disp() {
        System.out.println("my name is kamal");
    }

    void disp1() {
        System.out.println("12545556255");
    }
}

class demo {
    public static void main(String[] args) {
        B k = new B();
        k.input();
        k.input1();
        k.show();
        k.show1();
        C c1 = new C();
        c1.input();
        c1.disp();
        c1.disp1();
    }
}
