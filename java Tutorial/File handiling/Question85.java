import java.io.*;

public class Question85 {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter(System.out);
            writer.write('4' + '2'); // 54+50=104 ACSII
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
