import java.io.*;

public class FileInfo {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\RAM bHOLA\\Desktop\\myfile.txt");
         {
            if (f.createNewFile()) {
                System.out.println("File Successfully created");
            } else {
                System.out.println("File Already Exists");
            }
        } 
         (IOException e) {
            System.out.println("Exception Handled: " + e.getMessage());
        }
    }
}
