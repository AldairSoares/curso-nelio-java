package application;

import java.util.Scanner;

import entities.Rectangle;

public class Exercicio01Rectangle {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Rectangle r1 = new Rectangle();
		
		System.out.println("Enter rectangle width and height");
		
		r1.width = leia.nextDouble();
		r1.height = leia.nextDouble();
		
		
		System.out.printf("AREA = %.2f\n", r1.area());
		System.out.printf("PERIMETER = %.2f\n", r1.perimeter());
		System.out.printf("DIAGONAL = %.2f\n", r1.diagonal());
		
		
		leia.close();
	}

}
