package chain_of_responsibility_atm1;

public class Bill {

	private int value;
	private Bill next;
	
	public Bill(int value) {
		this.value = value;
	}
	
	public Bill(int value, Bill next) {
		this.value = value;
		this.next = next;
	}
	
	public void withdraw(int amount) {
		if (amount >= value) {
			final int count = amount / value;
			amount %= value;
			System.out.println(count + " bill(s) of $" + value + ". Remaining: $" + amount);
		}
		if (amount <= 0)
			return;
		if (next != null)
			next.withdraw(amount);
	}
	
}
