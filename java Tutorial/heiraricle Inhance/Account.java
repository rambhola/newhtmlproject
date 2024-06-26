public class Account {
    
    protected String accountholder;
    protected double balance;

    public Account(String accountholder, double balance) {
        this.accountholder = accountholder;
        this.balance = balance;
    }

    // This is a deposit function
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Successfully deposited " + amount);
    }

    // This is a Withdraw function
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn successfully " + amount);
        } else {
            System.out.println("Insufficient Balance " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayInfo() {
        System.out.println("Account holder name: " + accountholder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Account account = new Account("Rahul", 1200);
        account.displayInfo();
        account.deposit(500);
        account.withdraw(300);
        account.displayInfo();
    }
}
