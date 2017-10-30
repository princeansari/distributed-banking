/* 
Author1: Cillian Myles - 11424252 - 4BP1
Author2: Alan Byrne - 10300719 - 4BP1
Module: CT414 - Distributed Systems & Co-op Computing
Assignment: Distributed Banking System
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account implements AccountInterface {
	
	private int accountNum;
	private String accountName;
	private double balance;
	private List<Transaction> transactions; // transactions associated with this account object
	
	// constructor for type Account
	public Account (int accountNum, String accountName, double openingBalance) {
		this.setAccountNum(accountNum);
		this.setAccountName(accountName);
		this.setBalance(openingBalance);
		transactions = new ArrayList<Transaction>();
	}
	
	// add an object of type transaction to the list of transactions
	public void addTransaction(String type, double amount) {
		Transaction e = new Transaction(type, amount, getBalance()); 
		transactions.add(e);
	}
	
	// return all transactions 
	public List<Transaction> getTransactions() {
		return transactions;
	}
	
	// return all transactions within a specified date range
	public List<Transaction> getTransactionsByDate(Date fromDate, Date toDate) {
		
		List<Transaction> statementList = new ArrayList<Transaction>();
		
		for (int i=0; i<transactions.size(); i++) {
			Transaction element = transactions.get(i);
			
			// check if the date value falls between the specified range 
			if (element.getTransactionDate().after(fromDate) && element.getTransactionDate().before(toDate)) {
				statementList.add(element); 
			}
		}
		return statementList;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
}