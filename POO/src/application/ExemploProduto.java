package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;



public class ExemploProduto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		
		Product p1 = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		p1.name = leia.next();
		
		System.out.println("Price: ");
		p1.price = leia.nextDouble();
		
		System.out.println("Quantity in Stock: ");
		p1.quantity = leia.nextInt();
		
		
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
