package exercise7;

import java.util.ArrayList;

public class Bank {
	
	private ArrayList<Account> account;
	int numOfAccounts;
	
	public Bank() {
		account = new ArrayList<>();
	}
	
	public void addAccount(Account account) {
		this.account.add(account);
		numOfAccounts++;
	}
	
	public void removeAccount(Account account) {
		if(this.account.isEmpty()) {
			System.out.println("There is no account to remove");
		}
		this.account.remove(account);
		numOfAccounts--;
	}
	
	public int getNumOfAccount() {
		return numOfAccounts;
	}
	
	public void printAccountDetails() {
		System.out.println("========The Account Details are given below=========");
		if(account.isEmpty()) {
			System.out.println("There is no account in the bank");
		}else {
			
			System.out.println("Sl.No." + "	Customer's Name" + "		Account Number" + "		Account Balance");
			for(int i=0; i<account.size(); i++) {
				Account user = account.get(i);
				System.out.println(i+1 +"	"+user.getName()+"			"+user.getAccountNumber()+"			"+user.getBalance());
			}
		}
		System.out.println();
	}
	
	public void depositeMoney(Account account, double amount) {
		account.deposite(amount);
		System.out.println();
	}
	
	public void withdrawMoney(Account account, double amount) {
		account.withdraw(amount);
		System.out.println();
	}

}
