package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Produtos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int n  = leia.nextInt();
		
		Product[] vect = new Product[n];
		
		for(int i=0; i <n; i++)
		{
			leia.nextLine();
			String name = leia.nextLine();
			double price = leia.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		
		for(int i=0; i<n; i++) 
		{
			sum += vect[i].getPrice();
		}
		
		double avg = sum/n;
		
		System.out.printf("Average price: %.2f",avg);
		
		leia.close();
	}

}
