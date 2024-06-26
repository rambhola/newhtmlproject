abstract class A {

    String name = "Rambhola";
    int age = 22;

    abstract void show();
}

class B extends A {

    String name = "Kamal";
    int age = 21;

}

    void show() {
        System.out.println(name + "\n" + age);
    }

class main78 {
    public static void main(String args[]) {
        A a1 = new B();
        a1.show();

    }
}
