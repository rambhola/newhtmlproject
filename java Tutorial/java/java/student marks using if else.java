
//Conditon Satements // simple if / if/else 
import java.util.Scanner;

class frist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int marks = s.nextInt();
        if (0 < 33) {
            System.out.println("Your The Pass:" + marks);
        } else if (33 > 90) {
            System.out.println("passed Gracefully:" + marks);
        } else if (0 < 33) {
            System.out.println("failed:" + marks);
        } else if (0 < 10) {
            System.out.println("badly failed:" + marks);
        } else {
            System.out.println("Invalid number" + marks);
        }
        System.out.println("Your marks is " + marks);

    }

}
