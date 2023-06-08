package Interface;

interface bank_account{
	boolean dipositAmount(double amount);
	boolean withdrawAmount(double amount);
	double checkBalance();
}
class savingAccount implements bank_account{
	double balance = 0;
	double dayLimit = 10000;
	double todaysWithdraw = 0;
	
	@Override
	public boolean dipositAmount(double amount) {
		balance = balance +  amount;
		System.out.println("you have deposited "+amount);
		System.out.println("your account balance is "+balance);
		return true;
		
	}

	@Override
	public boolean withdrawAmount(double amount) {
		if(balance < amount) {
			System.out.println("You have insufficient funds ");
			return false;
		}
		else if(todaysWithdraw + amount > dayLimit)
		{
			System.out.println("You have crossed base limit");
			return false;
		}
		else {
			balance = balance - amount;
			todaysWithdraw = todaysWithdraw + amount;
			System.out.println("You have successfully withdraw"+amount);
			System.out.println("your balance is "+balance);
			return true;
		}
	}

	@Override
	public double checkBalance() {
		return balance;
	}
	
}
class currentAccount implements bank_account{
	double balance = 0;
	@Override
	public boolean dipositAmount(double amount) {
		balance = balance +  amount;
		System.out.println("you have deposited "+amount);
		System.out.println("your account balance is "+balance);
		return true;
	}

	@Override
	public boolean withdrawAmount(double amount) {
		if(balance < amount) {
			System.out.println("you have insufficient balance");
			return false; 
		}
		else {
			balance = balance - amount;
			System.out.println("You have successfully withdraw "+amount);
			System.out.println("your account balance"+balance);
			return true;
		}
	}

	@Override
	public double checkBalance() {
		return balance;
	}
	
}
public class Test_Interface {

	public static void main(String[] args) {
		bank_account mySaving = new savingAccount();
		mySaving.dipositAmount(2000);
		mySaving.dipositAmount(2000);
		mySaving.withdrawAmount(1000);
		mySaving.withdrawAmount(5000);
		mySaving.checkBalance();
		
		bank_account myCurrent = new currentAccount();
		myCurrent.dipositAmount(2000);
		myCurrent.dipositAmount(2000);
		myCurrent.withdrawAmount(1500);
		myCurrent.withdrawAmount(2000);
		myCurrent.checkBalance();
	}

}
