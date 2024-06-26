import java.util.Scanner;

class ReactAngle {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        int length, breadth;

        System.out.println("Enter The Length of Rectangle: ");
        length = ref.nextInt();
        System.out.println("Enter The Breadth of Rectangle: ");
        breadth = ref.nextInt();

        int area = React(length, breadth);

        System.out.println("Area of Rectangle: " + area);
    }

    static int React(int length, int breadth) {
        return length * breadth;
    }
}
