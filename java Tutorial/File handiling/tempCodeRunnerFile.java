import java.io.*;

public class Question85 {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter(System.out);
            writer.print('4' + '2'); // Changed Write to print
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
