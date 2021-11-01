package application;

import java.util.Scanner;

import entities.Funcionario;

public class Exercicio02Funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		Funcionario f1 = new Funcionario();
		
		System.out.println("Digite o nome do funcionario");
		System.out.println("Name: ");
		f1.name = leia.nextLine();
		
		System.out.println("Digite o salario bruto do funcionario");
		System.out.println("Gross salary: ");
		f1.grossSalary = leia.nextDouble();
		
		System.out.println("Digite o valor do imposto");
		System.out.println("Tax: ");
		f1.tax = leia.nextDouble();
		
		System.out.println("Employee:"+ f1.name +" ,$ "+ f1.netSalary());
		
		System.out.println("Which percentage to increase salary?");
		double percentage = leia.nextDouble();
		f1.increaseSalary(percentage);
		
		System.out.println(f1);
		
		
		
		leia.close();

	}

}
