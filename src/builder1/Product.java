package builder1;

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

	public void setId(Long id) {
		this.id = id;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getStock() {
		return stock;
	}

	public void setStock(Double stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", barCode=" + barCode + ", name=" + name + ", price=" + price + ", stock=" + stock
				+ "]";
	}
	
}
