package prototype2;

public class Address implements Cloneable {
	
	private String street;
	private int number;
	
	public Address(String street, int number) {
		super();
		this.street = street;
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public int getNumber() {
		return number;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
