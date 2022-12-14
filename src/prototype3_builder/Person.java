package prototype3_builder;

import java.util.Objects;

public class Person {

	private final Long id;
	private final String name;
	private final Address address;

	public Person(Long id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(address, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}

	public static class CloneBuilder {
		
		private Long id;
		private String name;
		private Address address;
		
		public CloneBuilder(String name) {
			this.name = name;
		}
		
		public CloneBuilder withId(Long id) {
			this.id = id;
			return this;
		}
		
		public CloneBuilder withAddress(Address address) {
			this.address = address;
			return this;
		}
		
		public Person build() {
			return new Person(id, name, address);
		}
	}

}
