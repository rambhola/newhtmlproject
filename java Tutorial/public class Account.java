public class Account{
	
protected String accountholder;
protected double balance

public Account (String accountholder,double balance) {

	this accountholder = accountholder;
	this.balance = balance;
  }

  // this is a deposit function
  public void deposit(double amount) {
        balance +=amount;
        System.out.println("Sucessfully deposited"+amount)
  }
   // this is a Withdaw function
  public void Withdaw(double amount) {
        
        if(balance>=amount){
        	balance-=amount;
        	System.out.println("Withdaw Sucessfully"+amount)

        }
        else{

        	System.out.println("Insuffient Balace"+amount)

        }




}

      public double GetBalance(){
      	return balance;
      }
      public double DisplayInfo(){
        System.out println("accountholder name"+accountholder);
        System.out println("Balance"+balance);
      	
      }
}
  