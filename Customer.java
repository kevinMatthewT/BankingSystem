package BankingSystem;

public class Customer {
	String CustName;
	int pin;
	
	public void setName(String name) {
		CustName= name;
	}
	
	public void setPin(int x){
		pin=x;
	}
	
	public String getName() {
		return CustName;
	}
	
	public int getPin() {
		return pin;
	}
}
