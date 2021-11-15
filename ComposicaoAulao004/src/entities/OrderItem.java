package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	//criando a composição do item com o produto
	
	private Product product;
	
	
	// construtor sem argumentos
	
	public OrderItem() {}

	// construtor
	public OrderItem(Integer quantity, Double price, Product product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	//get and set

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	// métodos
	
	public double subTotal() {
		return price*quantity;
		
	}
	
	
	//toString()
	
	@Override
	public String toString() {
		return getProduct().getName() + ", $"+ String.format("%.2f", price) + ", Quantity: "+quantity+", Subtotal: $"+String.format("%.2f",subTotal());
	}
	
}
