package entities;

public class Rectangle {
	//atributos
	
	public double width;
	public double height;
	
	
	
	//metodos
	
	public double area() {
		return width*height;
	}
	
	public double perimeter() {
		return 2*(width+height);
	}
	
	public double diagonal() {
		double a = Math.pow(width,2.0) + Math.pow(height, 2.0);
		return Math.sqrt(a);
	}
}
