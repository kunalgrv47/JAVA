package exercise7;

public class Main {

	public static void main(String[] args) {

		//----------Create Bank-----------------//
		Bank bank = new Bank();


		//----------Create Accounts-------------//
		Account account1 = new Account("Ram", "101", 1000);
		Account account2 = new Account("Shyam", "102", 1000);
		Account account3 = new Account("Amit", "103", 1000);


		//-------Add Account to the Bank-------//
		bank.addAccount(account1);
		bank.addAccount(account2);
		bank.addAccount(account3);

		//-------Print Accounts Details--------//
		bank.printAccountDetails();
		
		//------Deposite Money in Account------//
		bank.depositeMoney(account1, 1000);
		
		//------Withdraw Money from Account----//
		bank.withdrawMoney(account3, 500);

		//---------Remove Account--------------//
		bank.removeAccount(account1);

		//-------Print Accounts Details After Removing Accounts--------//
		bank.printAccountDetails();



	}

}
