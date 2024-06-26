import java.io.*;

public class Lo {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\RAM bHOLA\\Desktop\\myfile.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("File Successfully created");
            } else {
                System.out.println("File Already Exists");
            }
        } catch (IOException e) {
            System.out.println("Exception Handled: " + e.getMessage());
        }
    }
}
