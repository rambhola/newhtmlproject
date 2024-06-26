/*Static Methods and non Static Methods */

public class Static {
    static int num1 = 40;// Static Variable
    int num2 = 100; // Instance Variable

    public static void main(String[] args) {
        Static ref = new Static();
        ref.show();
        ref.disp();
    }

    static void show() {
        System.out.println("show() " + num1);
    }

    void disp() {
        System.out.println("disp() " + num1 + " " + num2);
    }
}
