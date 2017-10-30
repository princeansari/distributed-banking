/* 
Author1: Cillian Myles - 11424252 - 4BP1
Author2: Alan Byrne - 10300719 - 4BP1
Module: CT414 - Distributed Systems & Co-op Computing
Assignment: Distributed Banking System
*/

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface BankInterface extends Remote {
	
	public double deposit(int accountNum, double amount) throws RemoteException;
	public double withdraw(int accountNum, double amount) throws RemoteException;
	public double inquiry(int accountNum) throws RemoteException;
	public java.util.List<Transaction> getStatement(int accountNum, Date from, Date to) throws RemoteException;
	
}
