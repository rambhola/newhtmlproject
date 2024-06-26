import static java.lang.System.out;

public class Account {

    String name;
    String address;
    double balance; // Change int to double for balance

    public void display() {
        out.println(name);
        out.println("(");
        out.println(address);
        out.println(") has $");
        out.println(balance); // Corrected the variable name to balance
    }
}

public class UseAccount {

    public static void main(String[] args) {
        Account myAccount = new Account();
        Account yourAccount = new Account();

        myAccount.name = "Rambhola";
        myAccount.address = "Mandsaur CyberSpacde Line ";
        myAccount.balance = 24.02; // Corrected the balance value

        yourAccount.name = "kamal ";
        yourAccount.address = "Mandsaur Railway Satation Road";
        yourAccount.balance = 55.36; // Corrected the balance value

        myAccount.display();
        System.out.println();
        yourAccount.display();
    }
}
