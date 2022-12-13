package builder2;

public class Product {
	
	private final Long id;
	private final String barCode;
	private final String name;
	private final Double price;
	private final Double stock;
	
	public Product(Long id, String barCode, String name, Double price, Double stock) {
		this.id = id;
		this.barCode = barCode;
		this.name = name;
		this.price = price;
		this.stock = stock;
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

	@Override
	public String toString() {
		return "Product [id=" + id + ", barCode=" + barCode + ", name=" + name + ", price=" + price + ", stock=" + stock
				+ "]";
	}
	
	public static class Builder {

		private Long id;
		private String barCode;
		private String name;
		private Double price;
		private Double stock;
		
		public Builder(String name) {
			this.name = name;
		}
		
		public Builder andId(Long id) {
			this.id = id;
			return this;
		}
		
		public Builder andBarCode(String barCode) {
			this.barCode = barCode;
			return this;
		}
		
		public Builder andPrice(Double price) {
			this.price = price;
			return this;
		}
		
		public Builder andStock(Double stock) {
			this.stock = stock;
			return this;
		}
		
		public Product build() {
			return new Product(id, barCode, name, price, stock);
		}
		
	}
	
	
}
