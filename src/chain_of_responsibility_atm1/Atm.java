package chain_of_responsibility_atm1;

public class Atm {
	
	private Bill chain;
	
	public Atm(Bill chain) {
		this.chain = chain;
	}
	
	public void withdraw(int amount) {
		chain.withdraw(amount);
	}

}
