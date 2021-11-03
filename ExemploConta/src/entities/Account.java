package entities;

public class Account {
	
	
	// atributos: numero, titular e saldo
	
	private int number;
	private  String holder;
	private double balance;
	
	
	// Construtores
	// Criando dois tipos de construtores: um com 3 campos e outro com dois
	
	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}


	public Account(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}


	// Getters and Setters - encapsulamento
	
	// O número da conta não pode ser alterado - sem set
	// O balanço da conta será alterado por métodos - sem set
	// O nome pode ser alterado - tem get e set
	
    // Get() e Set() do titular
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	// Get() do número da conta
	public int getNumber() {
		return number;
	}

	
	// Get do saldo da conta
	public double getBalance() {
		return balance;
	}
	
	// métodos 
	// Depósito e saque
	
	// O depósito será void, porque não precisa retornar nada. Somente recebe o valor
	// o saque será void, porque não precisa retornar nada. Somente retira o valor do saldo.
	
	public void deposit(double amount) 
	{
		balance += amount;
	}
	
	public void withdraw(double amount) 
	{
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account: " +number+ ", Holder: "+holder+", Balance: $ "+String.format("%.2f", balance);
	}

}
