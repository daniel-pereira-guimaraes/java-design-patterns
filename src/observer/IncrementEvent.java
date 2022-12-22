package observer;

public class IncrementEvent {
	
	private Object sender;
	private int incValue;
	
	public IncrementEvent(Object sender, int incValue) {
		this.sender = sender;
		this.incValue = incValue;
	}
	
	public Object getSender() {
		return sender;
	}
	
	public int getIncValue() {
		return incValue;
	}

}
