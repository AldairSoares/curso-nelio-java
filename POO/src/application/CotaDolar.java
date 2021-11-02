package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class CotaDolar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("What's the dollar price in reais?:" );
		double dollarPrice = leia.nextDouble();
		
		System.out.println("How many dollars will be bought?: ");
		double amountDollars = leia.nextDouble();
		
		double d = CurrencyConverter.Calculator(amountDollars, dollarPrice);
		
		System.out.println(d);
		
		leia.close();
	}
	


}
