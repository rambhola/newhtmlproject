class A{
    int a;
    String n; // instance variable

    A() {
      a = 10;
      n = "Copy Constructor";
     System.out.println(a + "" + n);
     
    }
}


    // Copy Constructor
    A(A ref) // Objects reffrence
    {
        a = ref.a;
        n = ref.n;
        System.out.println(a + "" + n);
    }

}

// main method
class Num2 {
    public static void main(String[] args) {
        A r = new A();
        A r1 = new A(r);
    }
}
