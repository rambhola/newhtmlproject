 class SavingAccount extends Account{
	// constcor
	private double InterstRate;
	public SavingAccount(String accountholder, double balance, double InterstRate ) {
		super(accountholder,balance);
		this.InterstRate = InterstRate;
	}
	//fuction
	public void calculateintersrate() {

		double interet = balance*InterstRate/100;
		balance += balance;
		System.out.println("calculate InterstRate and added interet"+interet);
	}
}