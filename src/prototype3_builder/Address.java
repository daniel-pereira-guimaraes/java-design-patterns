package prototype3_builder;

import java.util.Objects;

public class Address {
	
	private final String street;
	private final int number;
	
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

	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + "]";
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(number, street);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return number == other.number && Objects.equals(street, other.street);
	}

}
