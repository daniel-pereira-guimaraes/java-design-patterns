// Alternative implementation for builder pattern.
package builder3;

public class Product {
	
	private Long id;
	private String barCode;
	private String name;
	private Double price;
	private Double stock;
	
	public Product(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getBarCode() {
		return barCode;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Double getStock() {
		return stock;
	}

	public Product setId(Long id) {
		this.id = id;
		return this;
	}

	public Product setBarCode(String barCode) {
		this.barCode = barCode;
		return this;
	}

	public Product setName(String name) {
		this.name = name;
		return this;
	}

	public Product setPrice(Double price) {
		this.price = price;
		return this;
	}

	public Product setStock(Double stock) {
		this.stock = stock;
		return this;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", barCode=" + barCode + ", name=" + name + ", price=" + price + ", stock=" + stock
				+ "]";
	}
	
}
