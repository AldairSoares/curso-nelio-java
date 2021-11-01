package application;

import java.util.Scanner;

import entities.Triangle;

public class ProgramPOO {

	public static void main(String[] args) {
		// Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas). 
		// Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui 
		// a maior área.
		
		// Com POO
		
		Scanner leia = new Scanner(System.in);
		
		Triangle x = new Triangle();
		
		Triangle y = new Triangle();
		
		System.out.println("Digite os valores dos lados do triângulo x: ");
		
		x.a= leia.nextDouble();
		x.b = leia.nextDouble();
		x.c= leia.nextDouble();
		
		System.out.println("Digite os valores dos lados do triângulo Y: ");
		
		y.a = leia.nextDouble();
		y.b = leia.nextDouble();
		y.c = leia.nextDouble();
		
				
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("triangulo x area: %.4f%n",areaX);
		
		System.out.printf("triangulo x area: %.4f%n",areaX);
		
		if(areaX > areaY) 
		{
			System.out.println("O triângulo x é o maior");
		}
		else 
		{
			System.out.println("O triângulo y é o maior");
		}
		
		leia.close();
	}

}
