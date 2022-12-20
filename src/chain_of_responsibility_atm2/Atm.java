package chain_of_responsibility_atm2;

public class Atm {
	
	private Bill chain;
	
	public Atm(int... values) {
		Bill prior = null;
		for (int i = 0; i < values.length; i++) {
			Bill bill = new Bill(values[i]);
			if (prior == null) {
				chain = bill;
				prior = bill;
			} else {
				prior.setNext(bill);
			}
			prior = bill;
		}
	}
	
	public void withdraw(int amount) {
		chain.withdraw(amount);
	}

}
