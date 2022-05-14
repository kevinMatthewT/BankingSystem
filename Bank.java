package BankingSystem;

public class Bank {
	double Withdrawal;
	double Deposit;
	double AccountDetails;
	
	public void toWithdraw(double W){
		Withdrawal=W;
		if (AccountDetails>=W) {
			AccountDetails-=Withdrawal;
			System.out.println("amount has been withdrawed");
		}else {
			System.out.println("insufficient funds");
		}
	}
	
	public void toDeposit(double D){
		Deposit=D;
		if (AccountDetails>=D) {
			AccountDetails+=Deposit;
			System.out.println("amount has been deposited");
		}
	}
}
