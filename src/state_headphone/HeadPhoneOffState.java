package state_headphone;

public class HeadPhoneOffState implements HeadPhoneState {

	private static final HeadPhoneState instance = new HeadPhoneOffState();
	
	private HeadPhoneOffState() {
	}

	public static HeadPhoneState getInstance() {
		return instance;
	}
	
	@Override
	public void click(HeadPhone headPhone) {
		System.out.println("Click > Do nothing!");
	}

	@Override
	public void longClick(HeadPhone headPhone) {
		headPhone.setOn(true);
		headPhone.setState(HeadPhoneOnState.getInstance());
		System.out.println("Long click > ON");
	}
	
}
