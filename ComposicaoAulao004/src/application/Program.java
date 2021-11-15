package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.println("Name: ");
		leia.nextLine();
		String name = leia.nextLine();
		
		System.out.print("Email: ");
		String email = leia.next();
		
		System.out.print("Birth date (DD/MM/YYYY)");
		Date birthDate = sdf.parse(leia.next());
		
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(leia.next());
		
		Order order = new Order(new Date(), status,client);
		
		System.out.println("How many items to this order?");
		
		int n = leia.nextInt();
		
		for(int i =1; i <=n; i++) {
			System.out.println("Enter #"+ i+ "item data:");
			System.out.print("Product name:");
			leia.nextLine();
			String productName = leia.nextLine();
			System.out.print("Product price");
			double productPrice = leia.nextDouble();
			System.out.print("Quantity: ");
			int quantity = leia.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem it = new OrderItem(quantity, productPrice, product);
			
			order.addItem(it);  
			
		}
		
		System.out.println(order);
		
		
		leia.close();
	}

}
