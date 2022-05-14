package BankingSystem;

public class Account{
    //setting account details
	String AccName;
	int pin=0;
	double AccountValue;
	int Times=0;
	boolean LoggedIn=false;
	boolean Running=true;
	
	public void setName(String name) {
		AccName= name;
	}
	
	public void setPin(int x){
		pin=x;
	}
	
	public String getName() {
		return AccName;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void toggleLOGIN(int PIN) {
		if (Times<3){
			if(pin==PIN){
				LoggedIn=true;
			}else {
				System.out.println("Wrong pin input please try again");
				Times++;
				if (Times<3) {
					System.out.println("you have "+(3-Times)+ " attempts left" );
				}else if (Times==3) {
					System.out.println("Your number of attempts have been reached, please try again later");
					Running=false;
				}
			}
		}
	}
	
	public String toString() {
		return "Account name"+AccName + "Account amount"+ AccountValue;
	}
	
	
}
