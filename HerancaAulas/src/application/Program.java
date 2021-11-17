package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	
	public static void main(String[]args) {
		
		Account acc = new Account(1001, "Alex",0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria",0.0, 500.00);
		
		//upcasting
		
		Account acc1 = bacc; 
		Account acc2 = new BusinessAccount(1003, "Bob",0.0,200.00);
		Account acc3 = new SavingsAccount(1004,"Anna", 0.0, 0.01);
		
		
		//Downcasting
		
		BusinessAccount acc4 = (BusinessAccount)acc2; // forçar o sistema para aceitar o downcasting
		acc4.loan(100.00);
	} 

}
