class A {

    String name;
    int roll;

    A() {
        roll = 101;
        name = "Copy Constructor";
        System.out.println(name + "" + roll);

    }

    // Copy Constructor
    A(A ref) {
        name = ref.name;
        roll = ref.roll;
        System.out.println(name + "" + roll);
    }

}

//
class B4 {
    public static void main(String[] args) {
        A C1 = new A();
        A C2 = new A(C1);
        System.out.println(C1);

    }
}