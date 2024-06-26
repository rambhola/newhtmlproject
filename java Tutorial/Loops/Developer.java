import java.util.Scanner;

interface client {
    void input();

    void output();
}

class Developer implements client {
    String name;
    double salary;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        name = sc.nextLine();
        System.out.println("Enter Salary: ");
        salary = sc.nextFloat();
    }

    public void output() {
        System.out.println(name + "\n" + salary);
    }

    public static void main(String[] args) {
        client c = new Developer();
        c.input();
        c.output();
    }
}