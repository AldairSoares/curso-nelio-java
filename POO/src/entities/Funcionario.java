package entities;

public class Funcionario {
	//atributos
	
	public String name;
	public double grossSalary;
	public double tax;
	public double netSalary;
	
	// metodos
	
	public double netSalary() 
	{
		netSalary = grossSalary - tax;
		return netSalary;
	}
	
	public void increaseSalary(double percentage) 
	{
		
		netSalary = netSalary + grossSalary *(percentage/100);
	}
	
	public String toString() {
		return name +", $ "+String.format("%.2f",netSalary);
	}
}
