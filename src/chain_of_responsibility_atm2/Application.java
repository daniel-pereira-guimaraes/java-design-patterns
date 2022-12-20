package chain_of_responsibility_atm2;

public class Application {

	public static void main(String[] args) {

		Atm atm = new Atm(100, 50, 10, 5, 1);
		atm.withdraw(1584);
	}

}
