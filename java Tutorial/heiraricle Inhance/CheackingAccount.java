public class CheackingAccount extends Account {
    private double OverDraftLimit;

    public CheackingAccount(String accountHolder, double balance, double overDraftLimit) {
        super(accountHolder, balance);
        this.OverDraftLimit = overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.OverDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return OverDraftLimit;
    }

    public void withdrawWithOverdraft(double amount) {
        if (getBalance() + OverDraftLimit >= amount) {
            double remainingBalance = getBalance() - amount;
            if (remainingBalance < 0) {
                OverDraftLimit += remainingBalance; // Adjust the overdraft limit
                setBalance(0);
                System.out.println("Withdrawn successfully using overdraft: " + amount);
            } else {
                setBalance(remainingBalance);
                System.out.println("Withdrawn successfully: " + amount);
            }
        } else {
            System.out.println("Insufficient Funds and Overdraft Limit: " + amount);
        }
    }

    public static void main(String[] args) {
        CheackingAccount checkingAccount = new CheackingAccount("Rahul", 1200, 500);
        checkingAccount.displayInfo();
        checkingAccount.deposit(300);
        checkingAccount.withdraw(1500);
        checkingAccount.withdrawWithOverdraft(1800);
        checkingAccount.displayInfo();
    }
}
