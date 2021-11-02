package util;

public class CurrencyConverter {
	
	public static final double IOF = 1.06;
	
	 
	
	public static double Calculator(double amountDollars, double dollarPrice) 
	{
		return dollarPrice*amountDollars*IOF;
	}

}
