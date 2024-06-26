// type casting converting data one to anothor datatype is called type casting -> so there 2 ways 1->Implicit 2->Explicit

// Implicit TypeCasting //

class Implicit {
    public static void main(String[] args) {

        int num1 = 100;
        double num2 = num1;
        System.out.println(num2);
        // 2->Explicit
        double num3 = 14.4;
        int num4 = (int) num3;
        System.out.println(num4);
    }
}