package entities;

public class Department {
	
	private String name;
	
	
	// sobrecarga - construtor vazio
	
	public Department() {
		
	}
		

	// construtores
	
	public Department(String name) {
		this.name = name;
	}

	// encapsulamento - get() and set()
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
