package state_headphone;

public class HeadPhonePlayingState implements HeadPhoneState {

	private static final HeadPhoneState instance = new HeadPhonePlayingState();

	private HeadPhonePlayingState() {
	}
	
	public static HeadPhoneState getInstante() {
		return instance;
	}

	@Override
	public void click(HeadPhone headPhone) {
		headPhone.setPlaying(false);
		headPhone.setState(HeadPhoneOnState.getInstance());
		System.out.println("Click > ON");
	}

	@Override
	public void longClick(HeadPhone headPhone) {
		headPhone.setPlaying(false);
		headPhone.setOn(false);
		headPhone.setState(HeadPhoneOffState.getInstance());
		System.out.println("Long click > OFF");
	}
	

}
