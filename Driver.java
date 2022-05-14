package BankingSystem;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
		Account Data=new Account();
		Customer EnteredData=new Customer();
		Bank actions=new Bank();
		
		
		while(Data.Running){
			System.out.println("What would you like to do?");
			System.out.println("1.Set up account | 2. Login the account | 3. Deposit money | 4. Withdraw money | 5. Show account details | 6. exit");
			int Option= read.nextInt();
			if(Option==1) {
				//making an account if no account by the name exist
				if (Data.getName()==null&&Data.getPin()==0) {
					System.out.println("Set up your name");
					String name=read.next();
					Data.setName(name);
					boolean Shouldrun=true;
					
					//make it so that pin must exist and is real
					while(Shouldrun){
						System.out.println("Set up your 6 digit pin");
						int newPin=read.nextInt();
						if(newPin<1000000 && newPin>99999 ) {
							Data.setPin(newPin);
							Shouldrun=false;
						}else {
							System.out.println("pin does not meet the requirements, please try again");
						}
					}
				}else {
					System.out.println("Sorry, the account already exists");
				}
			}else if(Option==2) {
				System.out.println("what is your account name?");
				String name=read.next();
				EnteredData.setName(name);
				
				//some error in the code but i tried hard but was unable to think as for why the customer and account name doesnt work
				boolean Shouldrun=true;
				
				/*while (Shouldrun) {
					if (EnteredData.getName()==Data.getName()) {
						Shouldrun=false;
					}else {
						System.out.println("please try again");
					}
					
				}
				Shouldrun=true;*/
				System.out.println("please input your pin");
				while(Shouldrun) {
					if (Data.LoggedIn==false) {
						int pin=read.nextInt();
						Data.toggleLOGIN(pin);
					}else {
						System.out.println("you are logged in");
						break;
					}
				
				}
				
			}else if(Option==3 &&Data.LoggedIn==true){
				boolean Shouldrun=true;
				while(Shouldrun) {
					System.out.println("Enter amount you want to Deposit");
					int Deposit=read.nextInt();
					if(Deposit>0) {
					    actions.toDeposit(Deposit);
					    Shouldrun=false;
					}else {
						System.out.println("You must deposit at a minimum of $1");
					}
					
				}
				
			}else if(Option==4 &&Data.LoggedIn==true){
				boolean Shouldrun=true;
				while(Shouldrun) {
					System.out.println("Enter amount you want to withdraw");
					int withdraw=read.nextInt();
					if(withdraw>0) {
					    actions.toWithdraw(withdraw);
					    Shouldrun=false;
					}else {
						System.out.println("You must withdraw at a minimum of $1");
					}
					
				}
				
			}else if(Option==5 &&Data.LoggedIn==true){
				System.out.println(Data.toString());
				
			}else if(Option==6){
				Data.Running=false;
				
			}
			
			
		}
	}

}
