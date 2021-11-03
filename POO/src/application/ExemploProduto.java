package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;



public class ExemploProduto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		
		
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		String name = leia.nextLine();
		
		System.out.print("Price: ");
		double price = leia.nextDouble();
		
		//System.out.print("Quantity in stock: ");
		//int quantity = leia.nextInt();
		
		Product p1 = new Product(name, price);
		
		
		System.out.println();
		System.out.println("Product data: " + p1);
		
		System.out.println("Enter the number of products to be added in stock");
		int quantity = leia.nextInt();
		p1.addProducts(quantity);
		
		System.out.println();
		
		System.out.println("Updated data: "+ p1);
		
		System.out.println();
		
		System.out.println("Enter the number of products to be removed in stock");
		quantity = leia.nextInt();
		p1.removeProducts(quantity);
		
		
        System.out.println();
		
		System.out.println("Updated data: "+ p1);
	
		leia.close();
	}

}
