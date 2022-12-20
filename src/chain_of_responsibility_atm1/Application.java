package chain_of_responsibility_atm1;

public class Application {

	public static void main(String[] args) {

		Atm atm = new Atm(new Bill(100, new Bill(50, new Bill(10, new Bill(5, new Bill(1))))));
		atm.withdraw(1584);
	}

}
