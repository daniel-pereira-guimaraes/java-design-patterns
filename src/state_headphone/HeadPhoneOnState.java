package state_headphone;

public class HeadPhoneOnState implements HeadPhoneState {

	private static final HeadPhoneState instance = new HeadPhoneOnState();
	
	private HeadPhoneOnState() {
	}

	public static HeadPhoneState getInstance() {
		return instance;
	}
	
	@Override
	public void click(HeadPhone headPhone) {
		headPhone.setPlaying(true);
		headPhone.setState(HeadPhonePlayingState.getInstante());
		System.out.println("Click > Playing");
	}

	@Override
	public void longClick(HeadPhone headPhone) {
		headPhone.setOn(false);
		headPhone.setState(HeadPhoneOffState.getInstance());
		System.out.println("Long click > OFF");
	}
	
}
