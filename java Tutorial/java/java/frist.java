public class Table {
    public static void main(String[] args) {
        for (int table = 2; table <= 10; table++) {
            System.out.println("Multiplication table for " + table + ":");
            
            for (int multi = 1; multi <= 10; multi++) {
                int result = table * multi;
                System.out.println(table + " * " + multi + " = " + result);
            }
            
            System.out.println(); // Add a blank line between tables
        }
    }
}
