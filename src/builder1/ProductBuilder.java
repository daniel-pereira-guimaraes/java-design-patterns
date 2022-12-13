package builder1;

public class ProductBuilder {

	private Long id;
	private String barCode;
	private String name;
	private Double price;
	private Double stock;
	
	public ProductBuilder(String name) {
		this.name = name;
	}
	
	public ProductBuilder andId(Long id) {
		this.id = id;
		return this;
	}
	
	public ProductBuilder andBarCode(String barCode) {
		this.barCode = barCode;
		return this;
	}
	
	public ProductBuilder andPrice(Double price) {
		this.price = price;
		return this;
	}
	
	public ProductBuilder andStock(Double stock) {
		this.stock = stock;
		return this;
	}
	
	public Product build() {
		Product p = new Product(name);
		p.setId(id);
		p.setBarCode(barCode);
		p.setPrice(price);
		p.setStock(stock);
		return p;
	}
	
}
