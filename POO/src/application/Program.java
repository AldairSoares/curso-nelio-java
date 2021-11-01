package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas). 
		// Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui 
		// a maior área.
		
		// Sem POO
		
		Scanner leia = new Scanner(System.in);
		
		double xA, xB, xC, yA,yB, yC;
		
		System.out.println("Digite os valores dos lados do triângulo x: ");
		
		xA = leia.nextDouble();
		xB = leia.nextDouble();
		xC = leia.nextDouble();
		
		System.out.println("Digite os valores dos lados do triângulo Y: ");
		
		yA = leia.nextDouble();
		yB = leia.nextDouble();
		yC = leia.nextDouble();
		
		double p = ((xA + xB + xC)/2.0);
		
		double areaX = Math.sqrt(p* (p-xA)*(p-xB)*(p-xC));
		
		p = ((yA + yB + yC)/2.0);
		
		double areaY = Math.sqrt(p* (p-yA)*(p-yB)*(p-yC));
		
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
