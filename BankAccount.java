package com.oops;

public class BankAccount {
	
	private String accountHolderName;
	private int balance;
	
	public void setaccountHolderName(String accountHolderName) {
		this.accountHolderName=accountHolderName;
	}
	public String getaccountHolderName() {
		return accountHolderName;
	}
	public void setbalance(int balance) {
		this.balance=balance;
	}
	public int getbalance() {
		return balance;
	}

	public static void main(String[] args) {
		 BankAccount bac=new BankAccount();
		 bac.setaccountHolderName("Gathri");
		 bac.setbalance(10000);
		 System.out.println(bac.getaccountHolderName());
		 System.out.println(bac.getbalance());
		

	}

}
