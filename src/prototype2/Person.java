package prototype2;

public class Person implements Cloneable {

	private Long id;
	private String name;
	private Address address;

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

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person p = (Person) super.clone();
		p.setAddress((Address) p.getAddress().clone());
		return p;
	}

}
