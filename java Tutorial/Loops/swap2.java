class A {

    void input() {
        System.out.println("Enter your name ");

    }

}

class B extends A {
    void show() {
        System.out.println("my name is ram");
    }
}

class C extends A {
    void disp() {
        System.out.println("my name is kamal");
    }
}

class demo {
    public static void main(String[] args) {
        B k = new B();
        k.input();
        k.show();
        C c1 = new C();
        c1.input();
        c1.show();
        c1.disp();
    }
}
